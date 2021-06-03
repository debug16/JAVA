package zjy_Icve.个人作业.面向对象编程2.choose3;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 0:38
 **/
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("输入两个是求最大公约数个最小公倍数：");

        x = sc.nextInt();
        y = sc.nextInt();


        int g = gongYue(x, y);
        System.out.printf("最大公约数：%d\t最小公倍数：%d\n", g, (x * y / g));
    }

    public static int gongYue(int x, int y) {
        while (x % y != 0) {
            x = (x + y) - (y = (x % y));
        }
        return y;
    }


}
