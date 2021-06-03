package zjy_Icve.个人作业.一维数组;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/20 21:03
 **/
public class task1_3 {
    public static void main(String[] args) {
        String[] str = new String[0];
        str = init(str);
        print_arr(str);
        
        int[] str1 = new int[0];
        str1 = init(str1);
        print_arr(str1);
    }

    public static String[] init(String[] str) {
        str = new String[]{"朴实", "沉毅", "敬业", "创新"};
        return str;

    }

    public static int[] init(int[] str) {
        str = new int[]{16, 32, 64, 52};
        return str;
    }

    public static void print_arr(String[] str) {
        for (String s : str) {
            System.out.printf("%s\t", s);
        }
        System.out.println();
    }

    public static void print_arr(int[] str) {
        for (int j : str) {
            System.out.printf("%d\t", j);
        }
        System.out.println();
    }
}
