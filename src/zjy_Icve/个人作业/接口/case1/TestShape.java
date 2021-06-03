package zjy_Icve.个人作业.接口.case1;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 9:25
 **/
public class TestShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入圆的直径和半径：");
        Round round = new Round(sc.nextDouble(), sc.nextDouble());
        System.out.print("输入三角形的的底和高：");
        Triangle triangle = new Triangle(sc.nextDouble(), sc.nextDouble());
        System.out.print("输入矩形的两条边：");
        Rectangle rectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());

        System.out.printf("圆的周长和面积为：%.2f\t%.2f\n", round.perimeter(), round.area());
        System.out.printf("三角形的周长和面积为：%.2f\t%.2f\n", triangle.perimeter(), triangle.area());
        System.out.printf("矩形的周长和面积为：%.2f\t%.2f\n", rectangle.perimeter(), rectangle.area());

    }
}
