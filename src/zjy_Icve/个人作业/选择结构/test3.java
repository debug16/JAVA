package zjy_Icve.个人作业.选择结构;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/7 9:23
 **/
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //第1题
        System.out.print("请输入一个数：");
        float num = sc.nextFloat();
        if (num > 90) {
            System.out.println("A");
        }else {
            System.out.println("其他");
        }

        //第2题
        System.out.print("请输入直角三角形的底和高：");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("直角三角形的斜边长是" + String.format("%.2f",c));

        //第3题
        System.out.print("请输入路程(km)和重量(t)：");
        float km = sc.nextFloat();
        float t = sc.nextFloat();
        float money = 0;
        if (km < 100 && km >= 0) {
            money = t;
        } else if (km >= 100 && km < 300) {
            money = t * .9f;
        } else if (km >= 300 && km < 500) {
            money = t * .8f;
        } else if (km >= 500 && km < 1000) {
            money = t * .7f;
        } else if (km >= 1000) {
            money = t * .8f;
        }
        System.out.println("路程"+km+"千米重量"+t+"吨需要"+money+"元");

        //第4题
        int f = 94; //腿
        int h = 35; //头
        int tu = 0;  //兔
        int j = 0;  //鸡
        for (j = 1; j <= h; j++) {  //假设 鸡 1 <= j(鸡) <= h(头)  tu(兔) = h(头) - j(鸡)
            if (j * 2 + (h - j) * 4 == f) {     //如果鸡兔腿相加等于f退出循环
                tu = h - j;
                break;
            }
        }
        System.out.println("鸡" + j + "只,兔" + t + "只");

        //第5题
        System.out.print("输入年份：");
        int year = sc.nextInt();
        System.out.println((year % 100 != 0 && year % 4 == 0) || year % 400 == 0 ? year + "是闰年" : year + "不是闰年");
    }

}
