package zjy_Icve.个人作业.循环结构.case3;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 16:34
 **/
public class test3 {
    public static void main(String[] args) {
        //3、编写一个java程序，计算1! +2! +...+10! 。
        int j = 1, sum = 0;
        for (int i = 1; i <= 10; i++) {
            j = j * i;
            sum += j;
            System.out.printf("%d  ",sum);
        }
    }
}
