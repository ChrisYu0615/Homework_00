package hw3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
 * 厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
 * 的號碼與總數，如圖：
 * (提示：Scanner)
 * (進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)
 */
public class Exer3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hateNumber;
        System.out.println("阿文...請輸入你討厭哪個數字?");
        while (true) {
            hateNumber = scan.nextInt();
            if (hateNumber > 9)
                System.out.println("數字不能大於9!!請再輸入一次");
            else
                break;
        }

        int count = 0; //斷行用(輸出六個就會斷行)，也可以計算總共有幾個
        ArrayList<Integer> lotteryNumbers = new ArrayList<>();

        //把討厭的數字排除，剩下放入ArrayList中
        for (int i = 1; i <= 49; i++) {
            if (i / 10 != hateNumber && i % 10 != hateNumber) {
                lotteryNumbers.add(i);
            }
        }

        //印出陣列所有元素
        for (Integer i : lotteryNumbers) {
            System.out.print(i + "\t");
            count++;
            if (count % 6 == 0) {
                System.out.println();
            }
        }
        System.out.println("總共有" + count + "個數字可以選");


        //隨機選出六個數字不重複
        System.out.println("隨機選好的數字為：");
        HashSet<Integer> newNumbers = pickNumberWithoutRepeat(lotteryNumbers);
        Iterator<Integer> iterator = newNumbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
    }

    public static HashSet<Integer> pickNumberWithoutRepeat(ArrayList<Integer> numbers) {
        HashSet<Integer> randomNumbers = new HashSet<>();
        while (randomNumbers.size() < 6) {
            randomNumbers.add(numbers.get((int) (Math.random() * numbers.size())));
        }
        return randomNumbers;
    }
}
