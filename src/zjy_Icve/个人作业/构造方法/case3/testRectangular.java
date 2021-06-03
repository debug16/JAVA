package zjy_Icve.个人作业.构造方法.case3;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 16:46
 **/
public class testRectangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入矩形的两条边:");
        Rectangular rectangular = new Rectangular(sc.nextDouble(),sc.nextDouble());
        System.out.printf("矩形的周长为:%.2f\t面积为:%.2f",rectangular.Perimeter(),rectangular.Area());
    }
}
