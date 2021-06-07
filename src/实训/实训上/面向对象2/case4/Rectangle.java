package 实训.实训上.面向对象2.case4;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/7 18:58
 **/
public class Rectangle {
    private double width, high;

    public Rectangle(double width, double high) {
        this.width = width;
        this.high = high;
    }

    public Rectangle() {
    }

    public static double area(double width, double high) {
        return (width * high);
    }

    public static double perimeter(double width, double high) {
        return (width + high) * 2;
    }

    public double area() {
        return (this.width * this.high);
    }

    public double perimeter() {
        return (this.width + this.high) * 2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
