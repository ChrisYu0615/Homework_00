package hw1;

/*
 * 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
 * 5 + 5
 * 5 + ‘5’
 * 5 + “5”
 * 並請用註解各別說明答案的產生原因
 */
public class Exer6 {
	public static void main(String[] args) {
		// 5+5結果會是10，兩者都是整數型態，所以"+"號會直接相加
		System.out.println(5 + 5);

		// 5+'5'結果會是58，由於'5'是char型態，要先找到對應的Unicode編碼(53)轉換成整數，在進行相加操作
		System.out.println(5 + '5');

		// 5 + "5"結果會是55，因為"5"是String型態，會讓"+"號兩邊進行拼接操作
		System.out.println(5 + "5");
	}
}
