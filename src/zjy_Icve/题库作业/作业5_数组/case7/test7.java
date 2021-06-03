package zjy_Icve.题库作业.作业5_数组.case7;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 22:31
 **/
public class test7 {
    public static void main(String[] args) {
        float[] num = {9, 8, 12, 45, 67, 23, 1, 98, 2.55f, 45};

        float max = num[0], min = num[0], p = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }


        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }

        for (int i = 1; i < num.length; i++) {
            p += num[i];
        }
        p /= num.length;

        System.out.printf("最大%.2f\t最小%.2f\t平均%.2f\t", max, min, p);

    }
}
