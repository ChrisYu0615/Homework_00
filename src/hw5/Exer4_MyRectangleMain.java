package hw5;

/**
 * • 請另外建立一個MyRectangleMain類別，此類別只有main方法 (1) 使用public
 * MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果 (2) 使用public
 * MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10,
 * 20，透過getArea()印出結果
 */
public class Exer4_MyRectangleMain {
	public static void main(String[] args) {
		// 使用空參建構式
		Exer4_MyRectangle rectangle1 = new Exer4_MyRectangle();
		rectangle1.setWidth(10);
		rectangle1.setDepth(20);
		System.out.println("rectangle1的面積是：" + rectangle1.getArea());

		// 使用有參建構式
		Exer4_MyRectangle rectangle2 = new Exer4_MyRectangle(10, 20);
		System.out.println("rectangle2的面積是：" + rectangle2.getArea());
	}
}
