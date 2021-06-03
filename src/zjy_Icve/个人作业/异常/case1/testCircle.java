package zjy_Icve.个人作业.异常.case1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 1:15
 **/
public class testCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle r = new Circle();
        System.out.print("请输入圆的半径：");
        try {
            double num = sc.nextDouble();
            r.setR(num);
            System.out.printf("圆的面积：%.2f\t圆的周长：%.2f\n", r.area(), r.perimeter());
        } catch (InputMismatchException e) {
            System.out.println("你的输入类型错误！");
        }
    }
}
