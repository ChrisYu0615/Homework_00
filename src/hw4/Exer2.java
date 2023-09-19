package hw4;

import java.util.Scanner;

/**
 * 請建立一個字串，經過程式執行後，輸入結果是反過來的
 * 例如String s = “Hello World”，執行結果即為dlroW olleH
 * (提示：String方法，陣列)
 */
public class Exer2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("請輸入隨意的字串：");

        //方法一：使用StringBuilder的reverse()
        StringBuilder sb = new StringBuilder(scan.next());
        System.out.println("原本的字串為：" + sb);
        System.out.println("反轉後的字串：" + sb.reverse());


        //方法二：使用String的toCharArray()，然後一個一個交換
        String str = scan.next();
        System.out.println("原本的字串為：" + str);
        //把String轉成char陣列
        char[] strToChars = str.toCharArray();
        //交換頭尾元素
        for (int i = 0; i < strToChars.length / 2; i++) {
            char temp = strToChars[i];
            strToChars[i] = strToChars[strToChars.length - i - 1];
            strToChars[strToChars.length - i - 1] = temp;
        }
        //把char陣列轉回String
        str = String.valueOf(strToChars);
        System.out.println("反轉後的字串：" + str);

        scan.close();
    }
}
