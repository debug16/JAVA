package zjy_Icve.题库作业.作业5_数组.case2;

import java.util.Arrays;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 20:39
 **/
public class test2 {
    public static void main(String[] args) {
        int[] num = {1, 5, 89, 53, 6, 2, 8, 3, 9, 3, 1, 90};
        Arrays.sort(num);
        for (int i : num) {
            System.out.printf("%d\t", i);
        }
    }
}
