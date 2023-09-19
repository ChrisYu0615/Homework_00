package hw4;

/**
 * 班上有8位同學，他們進行了6次考試結果如下：
 * 請算出每位同學考最高分的次數
 * (提示：二維陣列)
 */
public class Exer6 {
    public static void main(String[] args) {
        int[][] studentScores = {
                {10, 35, 40, 100, 90, 85, 75, 70},  //1考
                {35, 75, 77, 89, 64, 75, 70, 95},   //2考
                {100, 70, 79, 90, 75, 70, 79, 90},  //3考
                {77, 95, 70, 89, 60, 75, 85, 89},   //4考
                {98, 70, 89, 90, 75, 90, 89, 90},   //5考
                {90, 80, 100, 75, 50, 20, 99, 75}}; //6考

        //計算每一位學生最高分的次數
        int count1, count2, count3, count4, count5, count6, count7, count8;
        count1 = count2 = count3 = count4 = count5 = count6 = count7 = count8 = 0;
        int index = 0;

        for (int i = 0; i < studentScores.length; i++) {
            //找出每一次考試的最高分數
            int max = getMax(studentScores[i]);
            for (int j = 0; j < studentScores[i].length; j++) {
                //如果當前學生的考試成績等於當次考試的最高分數，則記住該學生的索引值
                if (studentScores[i][j] == max) {
                    index = j;
                    break;
                }
            }
            //通過索引值判斷是哪一位學生(0~7)，用switch-case增減該學生的最高分次數
            switch (index) {
                case 0:
                    count1++;
                    break;
                case 1:
                    count2++;
                    break;
                case 2:
                    count3++;
                    break;
                case 3:
                    count4++;
                    break;
                case 4:
                    count5++;
                    break;
                case 5:
                    count6++;
                    break;
                case 6:
                    count7++;
                    break;
                case 7:
                    count8++;
                    break;
            }
        }
        System.out.println("第一位同學考最高分的次數："+count1);
        System.out.println("第二位同學考最高分的次數："+count2);
        System.out.println("第三位同學考最高分的次數："+count3);
        System.out.println("第四位同學考最高分的次數："+count4);
        System.out.println("第五位同學考最高分的次數："+count5);
        System.out.println("第六位同學考最高分的次數："+count6);
        System.out.println("第七位同學考最高分的次數："+count7);
        System.out.println("第八位同學考最高分的次數："+count8);

    }

    public static int getMax(int[] studentScore) {
        int max = 0;
        for (int i = 0; i < studentScore.length; i++) {
            if (max < studentScore[i]) {
                max = studentScore[i];
            }
        }
        return max;
    }
}
