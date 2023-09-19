package hw4;

import java.util.Scanner;

/* 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
 * 例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
 * (提示1：Scanner，陣列)
 * (提示2：需將閏年條件加入)
 * (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
 */
public class Exer5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isLeapYear = false;
		// 用陣列存儲每個月的天數
		int[] daysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int year, month, day;
		int total = 0; // 計算總天數

		//年份輸入
		while (true) {
			System.out.println("請輸入年份：");
			year = scan.nextInt();
			if (year <= 0) {
				System.out.println("年份輸入錯誤，請重新輸入!!");
			} else {
				break;
			}
		}
		
		// 判斷該年是否為閏年
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			isLeapYear = true;
		}

		// 如果是閏年，就把2月改成29天
		if (isLeapYear) {
			daysOfMonth[1] = 29;
		}

		// 月份輸入
		while (true) {
			System.out.println("請輸入月份：");
			month = scan.nextInt();
			// 如果輸入的月份大於12或小於等於0，就要再輸入一次
			if (month > 12 || month <= 0) {
				System.out.println("月份輸入錯誤，請重新輸入!");
			} else {
				break;
			}
		}

		// 日期輸入
		while (true) {
			System.out.println("請輸入日期：");
			day = scan.nextInt();
			// 如果日期大於當月的天數或小於等於0，就要再輸入一次
			if (day <= 0 || day > daysOfMonth[month - 1]) {
				System.out.println("日期輸入錯誤，請重新輸入!");
			} else {
				break;
			}
		}

		// 日期加總；先加總到月份的日期總和
		for (int i = 0; i < month - 1; i++) {
			total += daysOfMonth[i];
		}
		// 最後把剩下的天數加進去
		total += day;

		System.out.println(year + "年" + month + "月" + day + "日");
		System.out.println("是當年度的第" + total + "天");
		scan.close();
	}
}