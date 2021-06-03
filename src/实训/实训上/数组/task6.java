package 实训.实训上.数组;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/11 8:25
 **/
public class task6 {
    static int[] arr = {1, 4, 2, 7, 0, 10, 28, 3, 6, 89};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //第一题
        {
            System.out.print("请输入你要知道斐波拉且数列的前几项和：");
            int num = sc.nextInt();
            int[] Fibonacci;
            Fibonacci = new int[num];
            Fibonacci[0] = Fibonacci[1] = 1;
            for (int i = 2; i < num; i++) {
                Fibonacci[i] = Fibonacci[i - 1] + Fibonacci[i - 2];
            }
            int he = 0;
            for (int e : Fibonacci) {
                he += e;
            }
            System.out.println(he);

        }

        //第二题
        {
            System.out.print("请输入你要查找的数：");
            int key = sc.nextInt();
            boolean flag = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    System.out.println("找到了序号为：" + i);
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("没有找到");
            }
        }

        //第三题
        {
            System.out.print("输入你接下来要输入的个数：");
            int n = sc.nextInt();
            System.out.print("输入" + n + "个整数：");
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            Arrays.sort(arr1);
            System.out.print("升序：");
            System.out.println(Arrays.toString(arr1));
            int arrL = arr1.length;
            for (int i = 0; i < arrL; i++) {
                if (i < arrL - i - 1) {
                    arr1[i] += arr1[arrL - i - 1];
                    arr1[arrL - i - 1] = arr1[i] - arr1[arrL - i - 1];
                    arr1[i] -= arr1[arrL - i - 1];
                }
            }
            System.out.print("降序：");
            System.out.println(Arrays.toString(arr1));
        }

        //第四题
        {
            float max, min, ave;
            float[] arr2 = new float[10];
            System.out.print("输入10个数：");
            for (int i = 0; i < 10; i++) {
                arr2[i] = sc.nextFloat();
            }
            max = min = ave = arr2[0];

            for (int i = 1; i < 10; i++) {
                if (arr2[i] > max) {
                    max = arr2[i];
                }
                if (arr2[i] < min) {
                    min = arr2[i];
                }
                ave += arr2[i];
            }
            ave /= 10;
            System.out.println("最大数为：" + max + "最小数为：" + min + "平均数为：" + ave);
        }

        //第五题
        {
            System.out.print("输入少于81各字符以回车结束:");
            String str = new String(sc.nextLine());
            int strLen = str.length();
            char[] c = str.toCharArray();

            int num = 0, dLetter = 0, xLetter = 0, other = 0;
            for (int i = 0; i < strLen; i++) {
                if (c[i] >= '0' && c[i] <= '9') {
                    num++;
                } else if (c[i] >= 'A' && c[i] <= 'Z') {
                    dLetter++;
                } else if (c[i] >= 'a' && c[i] <= 'z') {
                    xLetter++;
                } else {
                    other++;
                }
            }
            System.out.printf("数字%d个，小写字母%d个，大写字母%d个，其他%d个！", num, xLetter, dLetter, other);
        }

        //第六题
        {
            System.out.print("输入少于81各字符以回车结束:");
            String str = new String(sc.nextLine());
            int strLen = str.length();
            char[] c = str.toCharArray();
            System.out.print("输入要删除的字符：");
            char delete = sc.nextLine().charAt(0);
            int j = 0, k = 0;
            for (int i = 0; i < strLen; i++) {
                if (c[i] != delete) {
                    c[j] = c[i];
                    j++;
                }
            }
            for (int i = j; i < strLen; i++) {
                c[i] = ' ';
            }
            System.out.println(c);
        }

        //第七题
        {
            int[][] c = new int[3][3];
            int dj = 0, ss = 0, xs = 0;
            System.out.println("请输入三行三列的9个整数，每行3个空格分隔：");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    c[i][j] = sc.nextInt();
                }
            }
            System.out.println("二维数组：");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == j) {
                        dj += c[i][j];
                    } else if (i < j) {
                        ss += c[i][j];
                    } else {
                        xs += c[i][j];
                    }
                    System.out.print(c[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.printf("主对角线和：%d\n上三角形和：%d\n下三角形和：%d", dj, ss, xs);
        }

        //第八题
        {
            int[][] A = {{1, 2, 3}, {4, 5, 6}};
            int[][] B = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};
            System.out.println("矩阵A:");
            int[][] C = new int[2][4];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("%-4d\t", A[i][j]);
                }
                System.out.println();
            }
            System.out.println("矩阵B:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.printf("%-4d\t", B[i][j]);
                }
                System.out.println();
            }
            System.out.println("矩阵A*矩阵B:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 3; k++) {
                        C[i][j] += (A[i][k] * B[k][j]);
                    }
                    System.out.printf("%-4d\t", C[i][j]);
                }
                System.out.println();
            }
        }

    }
}
