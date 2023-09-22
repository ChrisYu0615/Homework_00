package hw5;

/*
利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
可以找出二維陣列的最大值並回傳，如圖：
 */
public class Exer3 {
	public static void main(String[] args) {
		Exer3 exer3 = new Exer3();
		int maxInt;
		double maxDouble;
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		maxInt = exer3.maxElement(intArray);
		maxDouble = exer3.maxElement(doubleArray);

		System.out.println("int二維陣列最大值為：" + maxInt);
		System.out.println("double二維陣列最大值為：" + maxDouble);
	}

	// 找出int二維陣列的最大值並傳回來
	public int maxElement(int[][] x) {
		int max = 0;
		for (int i[] : x) {
			for (int j : i) {
				if (max < j) {
					max = j;
				}
			}
		}
		return max;
	}

	// 找出double二維陣列的最大值並傳回來
	public double maxElement(double[][] x) {
		double max = 0;
		for (double[] i : x) {
			for (double j : i) {
				if (max < j) {
					max = j;
				}
			}
		}
		return max;
	}
}
