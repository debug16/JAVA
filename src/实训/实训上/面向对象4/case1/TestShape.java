package 实训.实训上.面向对象4.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/27 10:37
 **/
public class TestShape {
    public static void main(String[] args) {
        Ishape ishape = new Triangle(12,8);
        ishape.draw();

        double area = ((Triangle)ishape).getArea();
        System.out.println(area);
    }
}
