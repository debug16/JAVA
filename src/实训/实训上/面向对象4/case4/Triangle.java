package 实训.实训上.面向对象4.case4;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/7 20:10
 **/
public class Triangle extends Shape {
    private double n, m;//低和高

    public Triangle(double n, double m) {
        this.n = n;
        this.m = m;
    }

    @Override
    public double calArea() {
        return this.n * this.m / 2;
    }

}
