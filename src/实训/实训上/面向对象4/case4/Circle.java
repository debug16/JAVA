package 实训.实训上.面向对象4.case4;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/7 20:13
 **/
public class Circle extends Shape {
    private double r;//半径

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calArea() {
        return r * r * Math.PI;
    }
}
