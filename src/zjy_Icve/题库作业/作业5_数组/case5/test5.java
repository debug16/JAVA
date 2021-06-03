package zjy_Icve.题库作业.作业5_数组.case5;


import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 20:58
 **/
public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("输入一个n:");
        double n = sc.nextDouble();

        System.out.print("输入一个m:");
        int m = sc.nextInt();

        double sum = n;
        for (int i = 1; i < m; i++) {
            sum += (n = Math.sqrt(n));
        }
        System.out.println(sum);

    }
}
