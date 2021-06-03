package zjy_Icve.个人作业.方法声明和调用.case2;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 15:41
 **/
public class test2 {

    public static void main(String[] args) {
        System.out.println("最大值为："+Max(1,3,2));
    }
    public static int Max(int x, int y, int z) {
        if (x >= z && x >= y) {
            return x;
        } else if (y >= x && y >= z) {
            return y;
        } else {
            return z;
        }
    }

}