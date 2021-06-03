package zjy_Icve.题库作业.作业5_数组.case1;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 20:22
 **/
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("输入数组的长度n：");
        n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int k;
        System.out.print("输入一个整数k表示输出n个数里第k个个大的数:");
        k = sc.nextInt();

        for (int i = 0; i < k ; i++) {
            for (int j = i + 1; j < n; j++) {
                if (num[i] < num[j]) {
                    num[j] = (num[i] + num[j]) - (num[i] = num[j]);
                }
            }
        }
        System.out.printf("第%d大的数是%d", k, num[k - 1]);
    }

}
