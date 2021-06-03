package zjy_Icve.个人作业.抽象类.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 15:31
 **/
public class Triangle extends Shape {
    private double h, w;//底和高

    public Triangle(double h, double w) {
        this.h = h;
        this.w = w;
    }

    public Triangle() {

    }

    @Override
    public double area() {
        return h * w / 2;
    }

    public double area(double w, double h) {
        return h * w / 2;
    }

    @Override
    public double perimeter() {
        return Math.sqrt((Math.pow(w, 2) + Math.pow(h, 2))) + w + h;
    }

    public double perimeter(double w, double h) {
        return Math.sqrt((Math.pow(w, 2) + Math.pow(h, 2))) + w + h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }
}
