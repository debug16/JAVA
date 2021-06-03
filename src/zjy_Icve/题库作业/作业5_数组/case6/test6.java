package zjy_Icve.题库作业.作业5_数组.case6;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 21:29
 **/
public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入人数n：");int n = sc.nextInt();int[] num = new int[n];input(num);System.out.print("输入每隔几个人出局：");int m = sc.nextInt();fun(num, n, m);
    }
    public static void input(int[] num) {
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1; } }
    public static void fun(int[] num, int n, int m) {
        int j, k = n, count, outNum, d; //j为索引指针 k为数组个数，count报数技术 outNum出局数 d轮几个出局；
        d = count = outNum = 0;
        while (outNum != k) {
            for (int i = j = d = 0; i < n; i++) {
                count++;
                if (count % m != 0) {
                    num[j] = num[i];
                    j++;
                } else if (count % m == 0) {
                    d++;
                    outNum++;
                    System.out.printf("%d\t", num[i]); } }
            n -= d; } }}
