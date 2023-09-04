package hw2;

/*
 * 請設計一隻Java程式，輸出結果為以下：
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 * FFFFFF
 */
public class Exer7 {
    public static void main(String[] args) {
        char symbol = 'A';
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            symbol++;
            System.out.println();
        }
    }
}
