package zjy_Icve.个人作业.方法声明和调用.case4;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 16:06
 **/
public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个大于0的数判断是否为素数；");
        System.out.println(IsPrime(sc.nextInt()) ? "TRUE" : "FALSE");
    }

    public static boolean IsPrime(int x) {
        if (x <= 1) {//判断合法性
            return false;
        } else if (x == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(x); i++) {   // i 必须是小于等于 Math.sqrt
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
