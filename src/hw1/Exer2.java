package hw1;

/*
 * 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
 */
public class Exer2 {
	public static void main(String[] args) {
		int dozenCount, eggCount;
		dozenCount = 200 / 12;
		eggCount = 200 % 12;
		System.out.println("200顆蛋總共是" + dozenCount + "打" + eggCount + "顆");
	}
}
