package zjy_Icve.题库作业.作业6_类和对象.case3;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 19:30
 **/
public class test3 {
    public static void main(String[] args) {
        Box box = new Box(10, 20, 30);
        System.out.printf("盒子的表面积和体积为：%.2f\t%.2f", box.area(), box.volume());
    }
}

class Box {
    private final double x;
    private final double y;
    private final double z;

    public Box(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double area() {
        return ((x * y) + (x * z) + (y * z)) * 2;
    }

    public double volume() {
        return x * y * z;
    }

}
