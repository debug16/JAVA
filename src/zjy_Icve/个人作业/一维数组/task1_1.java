package zjy_Icve.个人作业.一维数组;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/20 20:23
 **/
public class task1_1 {
    public static void main(String[] args) {
        int[] a = {1, 4, 56, 8, 9};
        double[] b = {1.0, 10.5, 12, 7.2, 20.4};
        float[] f = {1, 2, 3, 4, 5};
        char[] c = new char[20];
        c[0] = 'a';
        c[1] = 'b';
        String[] str = new String[10];
        str[0] = "你好";
        str[1] = "湖南工院";
        System.out.print("a,b,f,c,str的各长度为：");
        System.out.printf("%d,%d,%d,%d,%d\n", a.length, b.length, f.length, c.length, str.length);
        System.out.print("a,b,f,c,str的下标有效范围为：");
        System.out.printf("%d,%d,%d,%d,%d\n", a.length - 1, b.length - 1, f.length - 1, c.length - 1, str.length - 1);
        System.out.print("a,b,f,c,str的索引为1的值为：");
        System.out.printf("%d,%.2f,%.2f,%c,%s\n", a[1], b[1], f[1], c[1], str[1]);
    }
}
