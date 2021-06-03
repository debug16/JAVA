package 实训.实训上.面向对象3.case1;

import java.awt.*;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/1 8:32
 **/
public class Triangle extends Shape {
    private Point pA; // 第1个顶点
    private Point pB; // 第2个顶点
    private Point pC; // 第3个顶点


    public Triangle() {
        super();
    }

    public Triangle(int ls, Color color) {
        super(ls, color);
    }

    public Triangle(Point pA, Point pB, Point pC) {
        super();
        this.pA = pA;
        this.pB = pB;
        this.pC = pC;
    }

    public void draw() {// 覆盖父类的draw()方法
        System.out.println("用宽度为" + lineSize + "，颜色为" + lineColore + "的线条画一个三角形");
    }

    public double getPerimeter() {
        //求出三边长
        double edge1 = Math.sqrt(Math.pow((pA.getX() - pB.getX()), 2) + Math.pow((pA.getY() - pB.getY()), 2));
        double edge2 = Math.sqrt(Math.pow((pA.getX() - pC.getX()), 2) + Math.pow((pA.getY() - pC.getY()), 2));
        double edge3 = Math.sqrt(Math.pow((pB.getX() - pC.getX()), 2) + Math.pow((pB.getY() - pC.getY()), 2));
        return edge1 + edge2 + edge3;
    }

    //求面积
    public double getArea() {
        //求半周长
        double hp = getPerimeter() / 2;
        double edge1 = Math.sqrt(Math.pow((pA.getX() - pB.getX()), 2) + Math.pow((pA.getY() - pB.getY()), 2));
        double edge2 = Math.sqrt(Math.pow((pA.getX() - pC.getX()), 2) + Math.pow((pA.getY() - pC.getY()), 2));
        double edge3 = Math.sqrt(Math.pow((pB.getX() - pC.getX()), 2) + Math.pow((pB.getY() - pC.getY()), 2));
        //利用海伦公式求面积
        double area = Math.sqrt(hp * (hp - edge1) * (hp - edge2) * (hp - edge3));
        return area;
    }


    public Point getpA() {
        return pA;
    }

    public void setpA(Point pA) {
        this.pA = pA;
    }

    public Point getpB() {
        return pB;
    }

    public void setpB(Point pB) {
        this.pB = pB;
    }

    public Point getpC() {
        return pC;
    }

    public void setpC(Point pC) {
        this.pC = pC;
    }
}
