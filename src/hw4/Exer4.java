package hw4;

import java.util.Scanner;

/*
 * 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下：
 * 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
 * 有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
 * 員工編號: 25 19 27 共 3 人!」
 * (提示：Scanner，二維陣列)
 */
public class Exer4 {
	public static void main(String[] args) {
		// 宣告員工陣列，放入員工編號與金額
		int[][] employees = { { 25, 2000 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		Scanner scan = new Scanner(System.in);
		// 用來計算有多少人符合條件
		int count = 0;
		System.out.println("請輸入想借的金額：");
		int money = scan.nextInt();

		System.out.print("有錢可借的員工編號：");
		// 判斷符合想借金額條件的人(大於等於)
		for (int i = 0; i < employees.length; i++) {
			if (employees[i][1] >= money) {
				count++;
				System.out.print(employees[i][0] + " ");
			}
		}
		System.out.println("共" + count + "人!");
		scan.close();
	}
}
