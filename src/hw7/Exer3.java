package hw7;

import java.io.*;

/**
 * 請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。
 * 呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案
 */
public class Exer3 {
    public static void main(String[] args) {
        Exer3 copyTest = new Exer3();
        copyTest.copyFile("Data.txt", "Data_copy.txt");
    }

    public void copyFile(String src, String dest) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dest);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            int data;
            byte[] buffer = new byte[1024];

            while ((data = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, data);
            }
            System.out.println("檔案複製成功!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
