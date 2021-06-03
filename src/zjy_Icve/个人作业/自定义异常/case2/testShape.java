package zjy_Icve.个人作业.自定义异常.case2;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 23:31
 **/
public class testShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Circular circular = new Circular(0);
            circular.area();
        } catch (err e) {
            System.out.println(e.getE());
        }

        try {
            Rectangular rectangular = new Rectangular(7, 8);
            rectangular.area();
        } catch (err e) {
            System.out.println(e.getE());
        }
        try {
            Triangle triangle = new Triangle(2, 0, 3);
            triangle.area();
        } catch (err e) {
            System.out.println(e.getE());
        }


    }
}
