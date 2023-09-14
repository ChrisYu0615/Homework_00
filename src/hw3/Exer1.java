package hw3;

import java.util.Scanner;
/*
請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形，如圖示結果：
(提示：Scanner，三角形成立條件，判斷式if else)
(進階功能：加入直角三角形的判斷)  
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

		if (y > x && y > z) {
			checkTriangle(y, x, z);
		} else if (z > y && z > x) {
			checkTriangle(z, x, y);
		} else {
			checkTriangle(x, y, z);
		}

		scan.close();
	}

	public static void checkTriangle(int x, int y, int z) {
		if (x == 0 || y == 0 || z == 0) {
			System.out.println("不是三角形");
		} else if (x * x == y * y + z * z) {
			System.out.println("直角三角形");
		} else if (x == y && y == z) {
			System.out.println("正三角形");
		} else if ((x == y && y != z) || (x == z && z != y)) {
			System.out.println("等腰三角形");
		} else {
			System.out.println("其他三角形");
		}

	}
}
