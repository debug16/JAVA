package zjy_Icve.个人作业.自定义异常.case1;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 22:57
 **/
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("输入一个数判断是否为素数：");
        try {
            int n;
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (prime(n)) {
                    System.out.printf("%d是一个素数", n);
                } else {
                    System.out.printf("%d不是一个素数", n);
                }
            } else {
                System.out.print("你输入的不是一个数字");
            }
        } catch (err e) {
            System.out.print(e.getE());
        }
    }
    public static boolean prime(int n) throws err {
        if (n < 1) {
            throw new err("不是一个合法数");
        }
        if (n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

class err extends Exception {
    private String e;


    public err(String e) {
        this.e = e;
    }

    public String getE() {
        return e;
    }
}
