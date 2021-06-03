package zjy_Icve.个人作业.抽象类.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 15:28
 **/
public class Rectangular extends Shape {
    private double w, h;

    public Rectangular(double w, double h) {
        this.w = w;
        this.h = h;
    }

    public Rectangular() {
    }


    @Override
    public double area() {
        return w * h;
    }

    public double area(double w, double h) {
        return h * w;
    }

    @Override
    public double perimeter() {
        return (w + h) * 2;
    }

    public double perimeter(double w, double h) {
        return (w + h) * 2;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
