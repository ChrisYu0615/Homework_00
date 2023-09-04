package hw2;

/*
 * 請設計一隻Java程式，輸出結果為以下：
 * 1 4 9 16 25 36 49 64 81 100
 * 3 5 7 9  11 13 15 17 19 都差2
 */
public class Exer4 {
    public static void main(String[] args) {
//        int i = 1;
//        int j = 3;
//        while (i < 100) {
//            System.out.print(i + " ");
//            i += j;
//            j += 2;
//        }

        for (int i = 1, j = 3; i < 100; j += 2) {
            System.out.print(i + " ");
            i += j;
        }
    }
}
