package zjy_Icve.个人作业.自定义异常.case2;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 23:26
 **/
public class Circular implements Shape {
    public double r;

    public Circular(double r) {
        this.r = r;
    }

    @Override
    public double area() throws err {
        if (r <= 0) {
            throw new err("半径小于0");
        }
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() throws err {
        if (r <= 0) {
            throw new err("半径小于0");
        } else
            return Math.PI * r * 2;
    }
}
