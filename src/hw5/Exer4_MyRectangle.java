package hw5;

/*
 * 請設計一個類別MyRectangle：
 * (1) 有兩個double型態的屬性為width, depth

 * (2) 有三個方法：
 * void setWidth(double width): 將收到的引數指定給width屬性
 * void setDepth(double depth): 將收到的引數指定給depth屬性
 * double getArea(): 能計算該長方形的面積

 * (3) 有兩個建構子：
 * public MyRectangle(): 不帶參數也無內容的建構子
 * public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性
 */
public class Exer4_MyRectangle {
	private double width;
	private double depth;

	public Exer4_MyRectangle() {

	}

	public Exer4_MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

	public void setWidth(double width) {
		if (width <= 0)
			System.out.println("寬不可以等於或小於0!!");
		else
			this.width = width;

	}

	public void setDepth(double depth) {
		if (depth <= 0)
			System.out.println("高不可以等於或小於0!!");
		else
			this.depth = depth;
	}

	public double getArea() {
		return width * depth;
	}
}
