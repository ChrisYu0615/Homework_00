package hw3;

import java.util.Scanner;

/**
 * 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
 * 對則顯示正確訊息，如圖示結果：
 * (提示：Scanner，亂數方法，無窮迴圈)
 * (進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)
 */
public class Exer2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int password = (int) (Math.random() * 101);
        int guess, max = 100, min = 0;

        System.out.println("開始猜數字吧!!(範圍區間" + min + "~" + max + ")");
        do {
            guess = scan.nextInt();
            if (password > guess && min < guess) {
                min = guess;
                System.out.println("猜錯囉!!(範圍區間" + min + "~" + max + ")");
            } else if (password < guess && max > guess) {
                max = guess;
                System.out.println("猜錯囉!!(範圍區間" + min + "~" + max + ")");
            }
        } while (guess != password);

        System.out.println("答對了!!密碼就是" + password);
    }
}
