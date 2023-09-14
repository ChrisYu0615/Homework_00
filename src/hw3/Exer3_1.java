package hw3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/*
阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討厭哪個數字，
請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇的號碼與總數，如圖：
(提示：Scanner)
(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)
*/
public class Exer3_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭的數字：");
		int number = scan.nextInt();
		int countNumber = 0;

		int[] lottery = new int[49];
		for (int i = 0, j = 1; i < lottery.length; i++, j++) {
			if (j / 10 != number && j % 10 != number) {
				lottery[i] = j;
				countNumber++;
			}
		}

		int count = 0;
		for (int i = 0; i < lottery.length; i++) {
			if (lottery[i] != 0) {
				System.out.print(lottery[i] + "\t");
				count++;
				if (count % 6 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("總共有" + countNumber + "個數字可以選");
	}
}
