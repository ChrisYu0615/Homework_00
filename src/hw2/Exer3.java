package hw2;

/*
 * 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
 * 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
 */
public class Exer3 {
    public static void main(String[] args) {
        int sum1 = multiplyWithForLoop();
        System.out.println("使用for迴圈計算1~10的階乘：" + sum1);

        int sum2 = multiplyWithWhileLoop();
        System.out.println("使用while迴圈計算1~10的階乘：" + sum2);

    }

    public static int multiplyWithForLoop() {
        int sum = 1;
        for (int i = 2; i <= 10; i++) {
            sum *= i;
        }
        return sum;
    }

    public static int multiplyWithWhileLoop() {
        int sum = 1;
        int i = 2;
        while (i <= 10) {
            sum *= i;
            i++;
        }
        return sum;
    }
}
