package hw5;

import java.util.Scanner;

/*
請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如圖
 */
public class Exer1 {

	public static void main(String[] args) {
		Exer1 exer1 = new Exer1();
		Scanner scan = new Scanner(System.in);
		int width = 0, height = 0;

		while (true) {
			System.out.println("請輸入寬與高：");
			if (scan.hasNextInt()) {
				width = scan.nextInt();
				height = scan.nextInt();
			}
			if (width != 0 && height != 0) {
				break;
			} else {
				System.out.println("寬或高不能為0，請重新輸入!!");
			}
		}
		exer1.starSquare(width, height);

		scan.close();
	}

	public void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
