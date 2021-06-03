package 实训.实训上.循环语句;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/15 14:08
 **/
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //第一题(求100~1000内的水仙花数)
        {
            System.out.println("100~1000以内的水仙花数为");
            for (int i = 100; i < 1000; i++) {
                if (fun1(i)) System.out.print(i + " ");
            }
        }


        //第二题(输入两个正整数m和n，求m和n的最大公约数和最小公倍数。)
        {
            System.out.println("\n输入两个正整数m和n，求m和n的最大公约数和最小公倍数：");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int gy = fun2(n, m);
            System.out.println("最大公约数是" + gy + "最小公倍数是" + (n * m / gy));
        }

        //第三题（从键盘输入若干个整数，以-1结束， 分别统计负数、0、正数的个数，并输出统计结果，最后一个-1不进行统计）
        {
            System.out.println("\n从键盘输入若干个整数，以-1结束， 分别统计负数、0、正数的个数，并输出统计结果，最后一个-1不进行统计");
            int num, ling, zheng, fu;
            ling = zheng = fu = 0;
            System.out.print("请输入：");
            do {
                num = sc.nextInt();
                if (num == 0) ling++;
                else if (num < 0 && num != -1) fu++;
                else if (num > 0) zheng++;
            } while (num != -1);
            System.out.println("0有" + ling + "个\n" + "正数有" + zheng + "个\n" + "负数有" + fu + "个\n");
        }

        //第四题（计算优秀率。输入5名同学的考试成绩，约定85分及以上为优秀，计算优秀率（优秀率为优秀总人数/总人数））
        {
            System.out.print("请输入五个同学的分数：");
            int count = 0;
            for (int i = 1; i <= 5; i++) {
                if (sc.nextInt() < 85) continue;
                else count++;
            }
            System.out.println("优秀率为" + (float) count / 5);
        }

        //第五题（购物结算）
        {
            System.out.println("**************************************************");
            System.out.println("请选择购物商品编号：");
            System.out.println("1.T恤(￥245)    2.网球鞋(￥570)    3.网球拍(￥350)");
            System.out.println("**************************************************");
            int num, money, fmoney, No;
            money = num = 0;
            while (true) {
                System.out.print("请输入商品编号：");
                No = sc.nextInt();
                switch (No) {
                    case 1 -> {
                        System.out.print("输入购买数量：");
                        num = sc.nextInt();
                        money += num * 245;
                        System.out.println("T恤￥245\t" + "数量" + num + "\t合计" + num * 245);
                    }
                    case 2 -> {
                        System.out.print("输入购买数量：");
                        num = sc.nextInt();
                        money += num * 570;
                        System.out.println("网球鞋￥570\t" + "数量" + num + "\t合计" + num * 570);
                    }
                    case 3 -> {
                        System.out.print("输入购买数量：");
                        num = sc.nextInt();
                        money += num * 350;
                        System.out.println("网球拍￥350\t" + "数量" + num + "\t合计" + num * 350);
                    }
                    default -> System.out.println("输入错误");
                }
                System.out.print("是否继续(y/n)：");
                if (sc.next().charAt(0) == 'n') break;
            }
            System.out.println("折扣0.8");
            money *= 0.8;
            System.out.println("应付金额：" + money);
            System.out.print("实付金额：");
            fmoney = sc.nextInt();
            while (fmoney < money) {
                System.out.println("钱不够加钱：");
                fmoney += sc.nextInt();
            }
            System.out.println("找钱：" + (fmoney - money));
        }

        //第六题(输出阶梯形式的9*9乘法口诀表)
        {
            System.out.println("输出阶梯形式的9*9乘法口诀表");
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + "*" + i + "=" + j * i + "\t");
                }
                System.out.println();
            }
        }

        //第七题(输出2~100之间的所有素数)
        {
            boolean flag = false;
            System.out.println("输出2~100之间的所有素数");
            for (int i = 2; i <= 100; i++) {
                flag = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) System.out.print(i + "\t");
            }
        }
    }

    static boolean fun1(int n) {
        int num = n;
        while (num != 0) {
            n -= Math.pow(num % 10, 3);
            num /= 10;
        }
        return n == 0;
    }

    static int fun2(int a, int b) {
        if (a <= 0 || b <= 0)
            return -1;
        while (true) {
            a = a % b;
            if (a == 0)
                return b;
            a += b;
            b = a - b;
            a -= b;
        }
    }
}

