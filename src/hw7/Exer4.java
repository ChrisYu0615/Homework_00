package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
 * 注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
 */
public class Exer4 {
    private static ArrayList<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        Exer4 exer4 = new Exer4();
        File file = new File("C:\\data", "Object.ser");
        //當找不到data資料夾時，就自動創建
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdir();
        }

        //新增四個動物到animals中
        animals.add(new Cat("虎斑"));
        animals.add(new Cat("三花"));
        animals.add(new Dog("柴犬"));
        animals.add(new Dog("哈士奇"));

        //寫入物件
        exer4.writeObjectToFile(file);
    }

    public void writeObjectToFile(File file) {
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);

            for (int i = 0; i < animals.size(); i++) {
                oos.writeObject(animals.get(i));
            }

            System.out.println("Object.ser寫入成功!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
