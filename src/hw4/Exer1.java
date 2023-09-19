package hw4;

/**
 * 有個一維陣列如下：
 * {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
 * (提示：陣列，length屬性)
 */
public class Exer1 {
    public static void main(String[] args) {
        int[] numbers = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        int sum = 0;

        //先求出陣列總和，在計算平均值
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double avg = sum / numbers.length;
        System.out.println("陣列的平均值為：" + avg);

        //比對陣列的每個元素，如果大於平均就輸出
        System.out.print("大於平均值的陣列元素有：");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > avg) {
                System.out.print(numbers[i] + "\t");
            }
        }
    }
}
