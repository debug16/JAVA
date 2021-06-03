package 实训.实训上.条件分支语句;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/6 10:43
 **/
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //第一题
        System.out.print("请输入三条边：");
        if (Triangle(sc.nextFloat(), sc.nextFloat(), sc.nextFloat())) {
            System.out.println("能构成一个三角形");
        } else {
            System.out.println("不能构成一个三角形");
        }


        //第二题
        System.out.print("请输入你的成绩：");
        GetGrade(sc.nextFloat());


        //第三题
        float money;
        System.out.println("请输入是否是会员：Y || 其他字符");
        char hy = sc.next().charAt(0);
        System.out.print("请输入购物金额：");
        if (hy == 'Y' || hy == 'y') {
            money = Shopper(true, sc.nextFloat());
        } else {
            money = Shopper(false, sc.nextFloat());
        }
        System.out.println("实际支付：" + money);


        //第四题
        System.out.print("输入一个数求水仙花数：");
        if (Narcissistic(sc.nextInt())) {
            System.out.println("是一个水仙花数");
        } else {
            System.out.println("不是一个水仙花数");
        }


        //第五题
        System.out.print("输入你的成绩：");
        GetGrade1(sc.nextFloat());


        //第六题
        System.out.print("输入你想知道那年哪月的天数 例(2021 3)：");
        System.out.println(Getday(sc.nextInt(), sc.nextInt()) + "天");
    }

    static int Getday(int year, int month) {
        int day = -1;
        if (month >= 0 && month <= 12 && year > 0) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    day = 31;
                }
                case 4, 6, 9, 11 -> {
                    day = 30;
                }
                case 2 -> {
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        day = 29;
                    } else {
                        day = 28;
                    }
                }

            }
        } else {
            System.out.println("你的输入错误！");
        }
        return day;
    }


    static boolean Narcissistic(int num) {
        int temp = num;
        while (num != 0) {
            temp -= (int) Math.pow(num % 10, 3);
            num /= 10;
        }
        return temp == 0;

    }

    static boolean Triangle(float a, float b, float c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    static void GetGrade(float chengji) {
        if (chengji <= 100 && chengji >= 0) {
            if (chengji >= 90) {
                System.out.println("优秀");
            } else if (chengji >= 80) {
                System.out.println("良好");
            } else if (chengji >= 70) {
                System.out.println("中等");
            } else if (chengji >= 60) {
                System.out.println("及格");
            } else {
                System.out.println("不及格");
            }
        } else {
            System.out.println("你的输入错误！");
        }
    }

    static void GetGrade1(float chengji) {
        switch ((int) chengji / 10) {
            case 10, 9 -> System.out.println("优秀");
            case 8 -> System.out.println("良好");
            case 7 -> System.out.println("中等");
            case 6 -> System.out.println("及格");
            default -> System.out.println("不及格");
        }
    }

    static float Shopper(boolean b, float money) {
        if (b) {
            if (money >= 200) {
                money *= 0.75f;
            } else if (money >= 100) {
                money *= 0.8f;
            }
        } else {
            if (money >= 100) {
                money *= 0.8f;
            }
        }
        return money;
    }
}