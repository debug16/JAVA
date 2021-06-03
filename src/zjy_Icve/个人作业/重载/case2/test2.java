package zjy_Icve.个人作业.重载.case2;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 23:31
 **/
public class test2 {
    //圆面积
    public static double area(double r) {
        return r * r * 3.14;
    }

    //矩形面积
    public static double area(double w, double h) {
        return w * h * 2;
    }

    //圆周长
    public static double perimeter(double r) {
        return r * 2 * 3.14;
    }

    //矩形周长
    public static double perimeter(double w, double h) {
        return (w + h) * 2;
    }
}
