package zjy_Icve.个人作业.接口.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 8:39
 **/
public class Triangle implements Shape {

    private double bottom, high;

    public Triangle(double bottom, double high) {
        this.bottom = bottom;
        this.high = high;
    }

    @Override
    public double area() {
        return bottom * high / 2;
    }

    @Override
    public double perimeter() {
        double bian;
        bian = Math.sqrt((high * high) + (bottom * bottom));
        return high + bottom + bian;
    }

    public double getBottom() {
        return bottom;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
