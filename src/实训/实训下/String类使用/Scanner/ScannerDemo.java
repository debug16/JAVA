package 实训.实训下.String类使用.Scanner;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/4 8:50
 **/
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入是个整数以非整数结束输入");
        sc.useDelimiter(",");//设置分隔符
        int[] arrInt = new int[10];
        for (int i = 0; i < 10; i++) {
            if (sc.hasNextInt()) {
                arrInt[i] = sc.nextInt();
                System.out.printf(" %d",arrInt[i]);
            } else {
                break;
            }
        }

        System.out.printf("平均数为%.2f,最大值为：%d,最小值为：%d", Average(arrInt), Max(arrInt), Min(arrInt));

    }

    public static float Average(int[] num) {
        int numLen = num.length;
        float count = 0;
        for (float value : num) {
            count += value;
        }
        return count / numLen;
    }

    public static int Max(int[] num) {
        int max = num[0];
        for (int j : num) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int Min(int[] num) {
        int min = num[0];
        for (int j : num) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
