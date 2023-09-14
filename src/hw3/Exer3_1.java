package hw3;

import java.util.Scanner;

/**
 * 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
 * 厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
 * 的號碼與總數，如圖：
 * (提示：Scanner)
 * (進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)
 */
public class Exer3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hateNumber;
        //隨機數判斷
        System.out.println("阿文...請輸入你討厭哪個數字?");
        while (true) {
            hateNumber = scan.nextInt();
            if (hateNumber > 9)
                System.out.println("數字不能大於9!!請再輸入一次");
            else
                break;
        }

        int count = 0; //斷行用(輸出六個就會斷行)，也可以計算總共有幾個

        //做出包含所有樂透號碼的陣列
        int[] lotteryNumbers = new int[50];
        for (int i = 1; i < lotteryNumbers.length; i++) {
            if (i / 10 != hateNumber && i % 10 != hateNumber) {
                lotteryNumbers[i] = i;
                count++;
            }
        }

        //做出真正能選的數字陣列(把0都排除掉)
        int[] newLotteryNumbers = new int[count];
        for (int i = 0, j = 0; i < lotteryNumbers.length; i++) {
            if (lotteryNumbers[i] != 0) {
                newLotteryNumbers[j] = lotteryNumbers[i];
                j++;
            }
        }

        count = 0;
        //輸出所有可以選擇的元素
        for (int i = 0; i < newLotteryNumbers.length; i++) {
            System.out.print(newLotteryNumbers[i] + "\t");
            count++;
            if (count % 6 == 0) {
                System.out.println();
            }
        }
        System.out.println("總共有" + count + "個數字可以選");

        //挑出不重複的6個隨機數字
        System.out.println("隨機選好的數字為：");
        int[] pickNumbers = pickNumbersWithoutRepeat(newLotteryNumbers);
        for (int i = 0; i < pickNumbers.length; i++) {
            System.out.print(pickNumbers[i] + "\t");
        }
    }

    public static int[] pickNumbersWithoutRepeat(int[] numbers) {
        int[] randomNumbers = new int[6];
        int number, count = 0;
        boolean checkRepeat = true;

        while (true) {
            //如果 count = 6 代表取隨機數字的陣列已經裝滿了
            if (count == 6) {
                break;
            }
            number = numbers[(int) (Math.random() * numbers.length)];

            //判斷是否有重複數字
            for (int i = 0; i < randomNumbers.length; i++) {
                if (number == randomNumbers[i]) {
                    checkRepeat = false;
                    break;
                }
            }
            //如果沒有checkRepeat會是true(表示沒有重複)，就會加入該元素並計算次數count+1
            if (checkRepeat) {
                randomNumbers[count] = number;
                count++;
            }
        }
        return randomNumbers;
    }
}
