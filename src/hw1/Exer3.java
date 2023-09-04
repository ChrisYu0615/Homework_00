package hw1;

/*
 * 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
 */
public class Exer3 {

	public static void main(String[] args) {
		int dayCount, hourCount, minCount, secCount;

		dayCount = 256559 / 86400;
		hourCount = (256559 - dayCount * 86400) / 3600;
		minCount = (256559 - dayCount * 86400 - hourCount * 3600) / 60;
		secCount = (256559 - dayCount * 86400 - hourCount * 3600 - minCount * 60);

		System.out.println("256559秒為：" + dayCount + "天" + hourCount + "小時" + minCount + "分" + secCount + "秒");
	}
}
