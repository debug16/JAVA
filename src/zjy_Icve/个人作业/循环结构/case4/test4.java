package zjy_Icve.个人作业.循环结构.case4;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 16:52
 **/
public class test4 {
    public static void main(String[] args) {
        //编写一个java程序，计算1-20之间所有偶数的和，循环变量的步长是2。
        int sum = 0;
        for (int i = 0; i <= 20; i += 2) {
            sum += i;
            System.out.printf("%d  ",sum);
        }
    }
}
