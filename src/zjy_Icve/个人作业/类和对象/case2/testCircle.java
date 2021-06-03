package zjy_Icve.个人作业.类和对象.case2;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 17:24
 **/
public class testCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入圆的半径:");
        Circle r = new Circle(sc.nextDouble());
        System.out.printf("圆的周长为:%.2f\t面积为:%.2f", r.Perimeter(), r.Area());
    }
}
