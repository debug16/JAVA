package zjy_Icve.个人作业.抽象类.choose1;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 16:16
 **/
public class testCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, h;
        System.out.print("请输入圆柱的半径和高：");
        r = sc.nextDouble();
        h = sc.nextDouble();

        Cylinder s = new Cylinder(r, h);
        s.show();
    }
}
