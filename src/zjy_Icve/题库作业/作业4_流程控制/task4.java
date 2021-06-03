package zjy_Icve.题库作业.作业4_流程控制;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/13 23:29
 **/
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //第1题
        System.out.print("输入三个整数：");
        minToMax(sc.nextInt(), sc.nextInt(), sc.nextInt());

        //第2题
        int a, b, gyNum;
        System.out.print("输入两个数求最大公约数：");
        a = sc.nextInt();
        b = sc.nextInt();
        gyNum = gy(a, b);
        System.out.println("最大公约数是" + gyNum + "\n最小公倍数是" + (a * b / gyNum));

        //第3题
        diamond(5);

        //第4题
        System.out.print("输入一个2~99之间的整数：");
        int num = sc.nextInt();
        if(num>=2&&num<=99){
            System.out.println(isomorph(num)?"是一个同构数":"不是一个同构数");
        }else {
            System.out.println("请按要求输入");
        }

        //第5题
        System.out.print("输入一个数(100 <= n <= 10000)：");
        int n = sc.nextInt();
        if(n>=100&&n<=10000)System.out.println("结果等于：" + fun5(n));
        else System.out.println("请按要求输入");

        //第6题
        for (int i = 100; i <= 1000; i++) {
            if (isPrime(i)) {
                if (isPrime(i + 2)) System.out.println(i + "和" + (i + 2) + "是姐妹素数");
            }
        }

        //第7题
        System.out.print("输入一个数（2 <= n <= 10）:");
        System.out.println("结果为" + fun7(sc.nextInt()));

        //第8题
        System.out.print("输入一个三位数：");
        System.out.println(fun8(sc.nextInt()) ? "是水仙花数" : "不是水仙花数");

        //第9题
        fun9();

        //第10题
        int year, month, day;
        System.out.print("输入年月日（空格分隔）：");
        year = sc.nextInt();
        month = sc.nextInt();
        day = sc.nextInt();
        System.out.println("是第" + fun10(year, month, day) + "天");

    }


    static void minToMax(int a, int b, int c) {
        if (b < a && b < c) {
            a += b;
            b = a - b;
            a = a - b;
        } else if (c < a && c < b) {
            a += c;
            c = a - c;
            a = a - c;
        }
        if (c < b) {
            b += c;
            c = b - c;
            b -= c;
        }
        System.out.println(a + " " + b + " " + c + "");
    }

    static int gy(int a, int b) {
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

    static void diamond(int n) {
        for (int i = 1; i <= n * 2 - 1; i++) {
            for (int j = 1; j <= n * 2 - 1; j++) {
                if (i <= n && j > n - i && j < n + i)
                    System.out.print("*");
                else if (i > n && j > i - n && j < n * 3 - i)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    static boolean isomorph(int num) {
        if (num * num >= 100) {
            return num * num % 100 == num;
        } else {
            return num * num % 10 == num;
        }
    }

    static double fun5(int n) {
        double num = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                num += i;
            }
        }
        return Math.sqrt(num);
    }

    static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    static int fun7(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num += Math.pow(2, i);
        }
        return num;
    }

    static boolean fun8(int n) {
        if (n <= 99 || n >= 1000) return false;
        int num = n;
        while (num != 0) {
            n -= Math.pow(num % 10, 3);
            num /= 10;
        }
        return n == 0;
    }

    static void fun9() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }

    static int fun10(int year, int month, int day) {
        int num = 0;
        switch (month) {
            case 12:
                num += 31;
            case 11:
                num += 30;
            case 10:
                num += 31;
            case 9:
                num += 30;
            case 8:
                num += 31;
            case 7:
                num += 31;
            case 6:
                num += 30;
            case 5:
                num += 31;
            case 4:
                num += 30;
            case 3:
                num += 31;
            case 2:
                num += (year % 100 != 0 && year % 4 == 0) || year % 400 == 0 ? 29 : 28;
            case 1:
                num += 31;
        }
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
            return num + day - 31;
        else if(month==2){
            if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0)
                return num+day-29;
            else return num+day-28;
        }else{
            return num + day - 30;
        }
    }
}
