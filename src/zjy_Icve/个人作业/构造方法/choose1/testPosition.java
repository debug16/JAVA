package zjy_Icve.个人作业.构造方法.choose1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 16:54
 **/
public class testPosition {
    public static void main(String[] args) {
        Position source = new Position(1, 4);
        Position target = new Position(2, 5);
        System.out.println("source的坐标是:");
        source.show();
        System.out.println("target的坐标是:");
        target.show();

        double distance = Math.sqrt(Math.pow((source.x - target.x), 2.0) + Math.pow((source.y - target.y), 2.0)); //两点距离
        System.out.printf("source到target的距离是:%.2f", distance);
    }
}
