package zjy_Icve.个人作业.抽象类.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 15:19
 **/

//圆Round类继承Shape抽象类
public class Round extends Shape {
    private double r;

    public Round(double r) {
        this.r = r;
    }

    public Round() {
    }

    @Override
    public double area() {
        return r * r * Math.PI;
    }

    public double area(double r) {
        return r * r * Math.PI;
    }

    @Override
    public double perimeter() {
        return r * 2 * Math.PI;
    }

    public double perimeter(double r) {
        return r * 2 * Math.PI;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
