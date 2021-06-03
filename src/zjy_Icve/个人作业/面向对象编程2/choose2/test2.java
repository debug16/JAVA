package zjy_Icve.个人作业.面向对象编程2.choose2;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 0:30
 **/
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];

        System.out.print("输入三个数：");
        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num[2] = sc.nextInt();

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] < num[i + 1]) num[i] = (num[i] + num[i + 1]) - (num[i + 1] = num[i]);    //比较交换
        }
        for (int n : num) {
            System.out.print(n + "\t");
        }
    }
}
