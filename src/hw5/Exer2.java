package hw5;

/*
• 請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
 */
public class Exer2 {
	public static void main(String[] args) {
		Exer2 exer2 = new Exer2();
		double avg = exer2.randAvg();
		System.out.println("平均值為：" + avg);
	}

	public double randAvg() {
		double sum = 0;
		int[] randomNumbers = new int[10];
		// 賦予randomNumbers每一個元素隨機值(0~100之間)
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = (int) (Math.random() * 101);
		}
		// 顯示亂數陣列的結果
		System.out.println("本次亂數結果：");
		for (int i = 0; i < randomNumbers.length; i++) {
			System.out.print(randomNumbers[i] + "\t");
			// 計算亂數陣列的總和
			sum += randomNumbers[i];
		}
		// 回傳亂數陣列的平均值
		return sum / randomNumbers.length;
	}
}
