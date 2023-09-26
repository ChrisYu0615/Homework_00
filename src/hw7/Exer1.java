package hw7;

import java.io.*;

/**
 * 請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
 * Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
 */
public class Exer1 {
    public static void main(String[] args) {
        File file = new File("Sample.txt");
        FileReader fr = null;
        BufferedReader bfr = null;
        String str;
        int countLine = 0; //計算有幾行
        int totalChars = 0; //計算有幾個字元
        try {
            fr = new FileReader(file);
            bfr = new BufferedReader(fr);
            //readLine()會讀取一行字元，並傳回String類型的資料
            while ((str = bfr.readLine()) != null) {
                System.out.println(str);
                totalChars += str.length(); //使用String的length()，取得每次讀取到的字元數，累加到totalChars
                countLine++; //每讀完一行就加一次
            }
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("Sample.txt檔案共有 " + file.length() + " 個位元組" + "，" + totalChars + " 個字元 " + countLine + " 列資料");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //關閉資源
            try {
                if (bfr != null) {
                    bfr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
