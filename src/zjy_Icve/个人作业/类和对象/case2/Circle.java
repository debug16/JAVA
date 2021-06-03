package zjy_Icve.个人作业.类和对象.case2;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 17:20
 **/
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double Perimeter() {
        return 3.14 * radius * 2;
    }

    public double Area() {
        return radius * radius * 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
