package hw1;

/*
 * 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
 */
public class Exer4 {
	public static void main(String[] args) {
		final double PI = 3.1415;
		double radius = 5;

//		System.out.println("圓的面積為：" + (PI * Math.pow(radius, 2)));
//		System.out.println("圓的周長為：" + (radius * 2 * PI));
		
		System.out.printf("圓的面積為：%.3f%n", (PI * Math.pow(radius, 2)));
		System.out.printf("圓的周長為：%.3f%n", (radius * 2 * PI));
	}
}
