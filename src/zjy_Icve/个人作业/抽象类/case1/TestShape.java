package zjy_Icve.个人作业.抽象类.case1;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 15:36
 **/
public class TestShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Round round = new Round();  //圆
        Rectangular rectangular = new Rectangular();//矩形
        Triangle triangle = new Triangle();//直角三角形

        System.out.print("请输入圆的半径：");
        round.setR(sc.nextDouble());

        System.out.print("请输入矩形的两条边：");
        rectangular.setH(sc.nextDouble());
        rectangular.setW(sc.nextDouble());

        System.out.print("请输入直角三角形的底和高：");
        triangle.setW(sc.nextDouble());
        triangle.setH(sc.nextDouble());

        System.out.printf("圆的面积和周长是：%.2f\t%.2f\n", round.area(), round.perimeter());
        System.out.printf("矩形的面积和周长是：%.2f\t%.2f\n", rectangular.area(), rectangular.perimeter());
        System.out.printf("直角三角形的面积和周长是：%.2f\t%.2f\n", triangle.area(), triangle.perimeter());

    }
}
