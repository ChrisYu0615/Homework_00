package hw3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exer3_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭的數字：");
		int number = scanner.nextInt();

		//篩選可以選擇的數字
		ArrayList lottery = new ArrayList();
		for (int i = 1; i <= 49; i++) {
			if (i / 10 != number && i % 10 != number) {
				lottery.add(i);
			}
		}

		//遍歷所有能選擇的數字
		int count = 0;
		Iterator iterator = lottery.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
			count++;
			if (count % 6 == 0) {
				System.out.println();
			}
		}
		System.out.println("總共有" + lottery.size() + "個數字可以選");

		
		//隨機取出6個不重複的數字
		System.out.println("隨機取出6個數字為：");
		Set hashSet = new HashSet<>();
		while (hashSet.size() < 6) {
			hashSet.add(lottery.get((int) (Math.random() * lottery.size()) + 1));
		}
		
		iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
	}
}
