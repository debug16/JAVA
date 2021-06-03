package zjy_Icve.个人作业.自定义异常.case2;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 23:28
 **/
public class Rectangular implements Shape {
    public double w, h;

    public Rectangular(double w, double h) throws err {
        this.w = w;
        this.h = h;

    }

    @Override
    public double area() throws err {
        if (w <= 0 || h <= 0) throw new err("小于等于0");
        else
            return w * h;
    }

    @Override
    public double perimeter() throws err {
        if (w <= 0 || h <= 0) throw new err("小于等于0");
        else
            return (w * h) * 2;
    }
}
