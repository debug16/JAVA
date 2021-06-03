package zjy_Icve.个人作业.构造方法.choose1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 16:52
 **/
public class Position {
    public int x, y;

    public Position(int x) {
        this.x = x;
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void show() {
        System.out.printf("X = %d,Y = %d\n", x, y);
    }
}
