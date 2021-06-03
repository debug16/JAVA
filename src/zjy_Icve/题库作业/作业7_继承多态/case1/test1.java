package zjy_Icve.题库作业.作业7_继承多态.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 20:01
 **/
public class test1 {
    public static void main(String[] args) {
        Shape[] t = {
                new Triangle(3, 5),
                new Rectangle(10, 20),
                new Circle(2)
        };
        System.out.print("三角形 矩形 圆的面积分别为：");
        for (Shape n : t) { System.out.printf("%.2f\t", n.calArea());} }
}
abstract class Shape {
    abstract double calArea();
}
class Triangle extends Shape {
    public double n, m;
    public Triangle(double n, double m) {
        this.n = n;
        this.m = m;
    }
    @Override
    public double calArea() {
        return n * m / 2;
    }
}
class Rectangle extends Shape {
    public double n, m;
    public Rectangle(double n, double m) {
        this.n = n;
        this.m = m; }
    @Override
    double calArea() {
        return n * m; }
}
class Circle extends Shape {
    public double n;
    public Circle(double n) {
        this.n = n; }
    @Override
    double calArea() {
        return Math.PI * n * n; }
}