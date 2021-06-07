package 实训.实训上.面向对象4.case4;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/7 20:12
 **/
public class Rectangle extends Shape {
    private double n, m;//长，宽

    public Rectangle(double n, double m) {
        this.n = n;
        this.m = m;
    }

    @Override
    public double calArea() {
        return n * m;
    }
}
