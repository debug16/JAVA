package zjy_Icve.题库作业.作业5_数组.case8;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 22:37
 **/
public class test8 {
    public static void main(String[] args) {
        String[] A = {"Jack", "Tom", "Lee", "John", "Alisa" };
        String[] B = {"Hello", "Hello", "Hello", "Hello", "Hello" };
        int len = B.length;
        String[] C = new String[len];
        //连接
        for (int i = 0; i < len; i++) {
            C[i] = B[i] + A[i];
        }

        //输出
        for (int i = 0; i < len; i++) {
            System.out.printf("%s\t", C[i]);
        }
    }
}
