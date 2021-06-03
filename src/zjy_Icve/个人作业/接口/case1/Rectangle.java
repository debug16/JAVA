package zjy_Icve.个人作业.接口.case1;
/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 9:23
 **/
public class Rectangle implements Shape {
    private double bian1, bian2;

    public Rectangle(double bian1, double bian2) {
        this.bian1 = bian1;
        this.bian2 = bian2;
    }

    @Override
    public double area() {
        return bian1 * bian2;
    }

    @Override
    public double perimeter() {
        return bian2 * 2 + bian1 * 2;
    }

    public double getBian1() {
        return bian1;
    }

    public void setBian1(double bian1) {
        this.bian1 = bian1;
    }

    public double getBian2() {
        return bian2;
    }

    public void setBian2(double bian2) {
        this.bian2 = bian2;
    }
}
