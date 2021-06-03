package zjy_Icve.个人作业.方法声明和调用.case3;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 15:55
 **/
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = sc.nextInt();
        if (Leap(year)) {
            System.out.printf("%d是闰年！", year);
        } else {
            System.out.printf("%d不是闰年！", year);
        }
    }

    public static boolean Leap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
