package 实训.实训上.面向对象3.case1;

import java.awt.*;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/1 8:37
 **/
public class testShape {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, Color.red);
        Rectangle rectangle = new Rectangle(3, Color.blue);
        triangle.setpA(new Point(1, 3));
        triangle.setpB(new Point(2, 4));
        triangle.setpC(new Point(5, 4));

        triangle.lineSize = 2;
        rectangle.lineSize = 1;

        rectangle.setTop(10);
        rectangle.setLeft(6);
        rectangle.setHeight(10);
        rectangle.setWidth(20);
        triangle.draw();
        rectangle.draw();

        System.out.println(rectangle.getArea());
    }

}
