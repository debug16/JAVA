package zjy_Icve.个人作业.自定义异常.case2;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 23:29
 **/
public class Triangle implements Shape {
    public double x, y, z;

    public Triangle(double x, double y, double z) throws err {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double area() throws err {
        if (x + y < z || x + z < y) {
            throw new err("不能构成三角形");
        } else
            return x * y / 2;
    }

    @Override
    public double perimeter() throws err {
        if (x + y < z || x + z < y) {
            throw new err("不能构成三角形");
        } else
            return x + y + z;
    }
}
