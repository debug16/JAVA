package 实训.实训上.面向对象4.case4;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/7 20:14
 **/
public class TestShap {
    public static void main(String[] args) {
        Shape[] shape = {
                new Circle(2),
                new Rectangle(4, 5),
                new Triangle(5, 6)
        };
        System.out.println("半径为2的圆\t长4、宽5的矩形\t底5、高6的三角形的面积为：");
        for (Shape s : shape) {
            System.out.println(s.calArea());
        }
    }
}
