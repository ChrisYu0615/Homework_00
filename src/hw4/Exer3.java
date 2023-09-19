package hw4;

/**
 * 有個字串陣列如下 (八大行星)：
 * {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"}
 * 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
 * (提示：字元比對，String方法)
 */
public class Exer3 {
    public static void main(String[] args) {
        int count = 0;
        String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};

        //外層迴圈控制陣列的元素位置
        for (int i = 0; i < planets.length; i++) {
            //內層迴圈控制陣列元素的每一個字元
            for (int j = 0; j < planets[i].length(); j++) {
                //使用switch case比對每一個字元是否出現母音
                switch (planets[i].charAt(j)) {
                    case 'a', 'i', 'e', 'o', 'u':
                        count++;
                        break;
                }
            }
        }
        System.out.println("母音總共出現 " + count + " 次");
    }
}