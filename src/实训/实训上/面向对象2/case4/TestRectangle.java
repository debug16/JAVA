package 实训.实训上.面向对象2.case4;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/7 19:04
 **/
public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        double width, high;
        System.out.println("输入长方形的长：");
        width = sc.nextDouble();
        rectangle.setWidth(width);
        System.out.println("输入长方形的宽：");
        high = sc.nextDouble();
        rectangle.setHigh(high);

        System.out.printf("长为%.2f，宽为%.2f的长方形的面积为%.2f\n", width, high, rectangle.area());
        System.out.printf("长为%.2f，宽为%.2f的长方形的面积为%.2f\n", width, high, rectangle.perimeter());
    }
}
