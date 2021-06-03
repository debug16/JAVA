package zjy_Icve.个人作业.异常.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 1:10
 **/
class Circle {
    private double r;

    public Circle() {
        this(0);
    }

    public Circle(double r) {
        this.r = r;
    }

    //圆的面积
    public double area() {
        return Math.PI * r * r;
    }

    //圆的周长
   public double perimeter() {
        return Math.PI * r * 2;
    }


    public void setR(double r) {
        this.r = r;
    }
}
