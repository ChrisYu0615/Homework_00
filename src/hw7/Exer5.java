package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * 承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多
 * 型簡化本題的程式設計)
 */
public class Exer5 {
    private static ArrayList<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        Exer5 exer5 = new Exer5();
        File file = new File("C:\\data", "Object.ser");

        exer5.readObjectFromFile(file);
    }

    public void readObjectFromFile(File file) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);


            while (animals.size() < 4) {
                //加入讀取到的物件(強轉Animal)
                animals.add((Animal) ois.readObject());
            }
            //遍歷animals，並調用各自的speak()
            for (Animal animal : animals) {
                animal.speak();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            //關閉資源
            try {
                if (ois != null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
