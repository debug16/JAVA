package zjy_Icve.个人作业.接口.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 8:34
 **/
public class Round implements Shape {
    private double diameter, radius;//直径，半径

    public Round(double diameter, double radius) {
        this.diameter = diameter;
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * 3.14;
    }

    @Override
    public double perimeter() {
        return diameter * 3.14;
    }
}
