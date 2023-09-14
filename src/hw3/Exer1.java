package hw3;

import java.util.Scanner;

/**
 * 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
 * 三角形、其它三角形或不是三角形，如圖示結果：
 * (提示：Scanner，三角形成立條件，判斷式if else)
 * (進階功能：加入直角三角形的判斷)
 */
public class Exer1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0, y = 0, z = 0;

        System.out.println("請輸入三個整數：");
        if (scan.hasNextInt()) {
            x = scan.nextInt();
            y = scan.nextInt();
            z = scan.nextInt();
        }

        //把最長邊保持在第一個方法參數
        if (y > x && y > z)
            checkTriangle(y, x, z);
        else if (z > x && z > y)
            checkTriangle(z, x, y);
        else
            checkTriangle(x, y, z);
    }

    public static void checkTriangle(int x, int y, int z) {
        if (x == 0 || y == 0 || z == 0)
            //只要有一邊為0就不是三角形
            System.out.println("不是三角形");
        else if ((int) Math.pow(x, 2) == (int) Math.pow(y, 2) + (int) Math.pow(z, 2))
            //直角三角形：最長邊平方 = 另外兩邊平方相加
            System.out.println("是直角三角形");
        else if (x == y && y == z)
            System.out.println("是正三角形");
        else if (x == y || x == z || y == z)
            System.out.println("是等腰三角形");
        else
            System.out.println("是其他三角形");
    }
}
