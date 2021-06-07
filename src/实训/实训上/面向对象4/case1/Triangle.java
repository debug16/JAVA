package 实训.实训上.面向对象4.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/27 10:28
 **/
public class Triangle implements Ishape {
    double down, higt;

    public Triangle(double down, double higt) {
        this.down = down;
        this.higt = higt;
    }


    @Override
    public void draw() {

    }

    public double getArea() {
        return down * higt / 2;
    }

    public double getDown() {
        return down;
    }

    public void setDown(double down) {
        this.down = down;
    }

    public double getHigt() {
        return higt;
    }

    public void setHigt(double higt) {
        this.higt = higt;
    }
}
