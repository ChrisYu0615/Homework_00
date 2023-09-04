package hw2;

public class Exer1 {
	public static void main(String[] args) {
		print99WithForWhileLoop();
		
		System.out.println("=======================================================================");
		
		print99WithForDoWhileLoop();
		
		System.out.println("=======================================================================");
		
		print99WithWhileDoWhileLoop();
	}
	
	// 使用for + while實現
	public static void print99WithForWhileLoop() {
		int sum;
		int i, j;

		for (i = 1; i <= 9; i++) {
			j = 1;
			while (j <= 9) {
				sum = i * j;
				System.out.print(i + "*" + j + "=" + sum + "\t");
				j++;
			}
			System.out.println();
		}
	}

	public static void print99WithForDoWhileLoop() {
		// 使用for + do-while迴圈實現
		int sum;
		int i, j;

		for (i = 1; i <= 9; i++) {
			j = 1;
			do {
				sum = i * j;
				System.out.print(i + "*" + j + "=" + sum + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
		}
	}

	public static void print99WithWhileDoWhileLoop() {
		// 使用while + do-while迴圈實現
		int sum;
		int i, j;

		i = 1;
		while (i <= 9) {
			j = 1;
			do {
				sum = i * j;
				System.out.print(i + "*" + j + "=" + sum + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
			i++;
		}
	}
}
