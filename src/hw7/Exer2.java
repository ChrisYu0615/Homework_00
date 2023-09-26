package hw7;

import java.io.*;

/**
 * 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡
 * (請使用append功能讓每次執行結果都能被保存起來)
 */
public class Exer2 {
    public static void main(String[] args) {
        File file = new File("Data.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);

            for (int i = 0; i < 10; i++) {
                int random = (int) (Math.random() * 1000) + 1;
                bw.write(random + "\t");
            }
            //每寫入10個數字就換行
            bw.newLine();
            System.out.println("在Data.txt中成功寫入10個1~1000的隨機數!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //關閉資源
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
