package hw1;

/*
 * 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
 * 金加利息共有多少錢 (用複利計算，公式請自行google)
 * 【複利公式】FV ＝ PV×（1 ＋ R）n 次方
 * FV 為期末本利和，PV 為期初本金，R 為每期利率，n 為期數
 */
public class Exer5 {
    public static void main(String[] args) {
        double balance = 1500000;
        double interestRate = 0.02;
        double totalBalance = balance * Math.pow(1 + interestRate, 10);

        System.out.printf("10年後的本金加利息金額為：%.0f",totalBalance);
    }
}
