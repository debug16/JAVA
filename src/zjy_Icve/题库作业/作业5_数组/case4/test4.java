package zjy_Icve.题库作业.作业5_数组.case4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 20:48
 **/
public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个字符串：");
        String str = sc.nextLine();
        char[] c = str.toCharArray();//转为char型数组；
        pour(c);//数组倒序
        System.out.println(Arrays.toString(c));
    }

    public static void pour(char[] c) {
        int j = c.length - 1, i = 0;
        while (j > i) {
            c[i] = (char) ((c[i] + c[j]) - (c[j] = c[i]));
            j--;
            i++;
        }
    }
}
