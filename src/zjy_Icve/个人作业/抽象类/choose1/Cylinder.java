package zjy_Icve.个人作业.抽象类.choose1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 16:09
 **/
public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height)  //继承父类的域并初始化；
    {
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public double volume(double radius, double height) {
        return area(radius) * height;
    }

    public double volume() {
        return area() * height;
    }

    public void show() {
        System.out.printf("圆柱的半径为：%.2f\t高为：%.2f\t体积为：%.2f", radius, height, volume(radius, height));
    }

    public void show(double radius, double height) {
        System.out.printf("圆柱的半径为：%.2f\t高为：%.2f\t体积为：%.2f", radius, height, volume(radius, height));
    }

}