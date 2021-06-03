package zjy_Icve.个人作业.构造方法.case3;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 16:43
 **/
public class Rectangular {
    private double x, y;//两条边

    public Rectangular(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double Perimeter() {
        return (x + y) * 2;
    }

    public double Area() {
        return x * y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
