package zjy_Icve.个人作业.面向对象编程2.choose1;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 0:25
 **/
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.print("请输入两个数：");
        //输入
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.printf("两数交换前：%d\t%d\n", x, y);

        //交换两数
        x = (x + y) - (y = x);

        //输出
        System.out.printf("两数交换后：%d\t%d\n", x, y);
    }
}
