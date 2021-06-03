package zjy_Icve.个人作业.重载.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 23:05
 **/
public class test1 {
    public static void sort(int x, int y, int z) {
        //始终要x>=y>=z
        //最后直接输出x , y , z
        if (y > x && y > z) {   //判断y是不是最大
            x = (x + y) - (y = x);  //是：x y 交换两值
        } else if (z > x && z > y) {    ////判断z是不是最大
            x = (x + z) - (z = x);  //是：x z 交换两值
        }
        if (y < z) {        //再判断 y是不是小于z
            z = (z + y) - (y = z);  //是：y z 交换
        }
        System.out.printf("%d\t%d\t%d\n", x, y, z);
    }

    public static void sort(int x, int y) {
        if (y > x) x = (x + y) - (y = x);
        System.out.printf("%d\t%d\n", x, y);
    }

    public static void main(String[] args) {
        //从大到小排序
        sort(-3, -1);
        sort(1, 0, 5);
    }
}
