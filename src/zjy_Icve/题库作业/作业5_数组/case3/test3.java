package zjy_Icve.题库作业.作业5_数组.case3;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 20:42
 **/
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个要转为二进制的十进制数：");

        int num = sc.nextInt();
        System.out.print(Integer.toBinaryString(num));
    }
}
