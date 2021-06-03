package zjy_Icve.个人作业.一维数组;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/20 21:40
 **/
public class task2_1 {
    public static void main(String[] args) {
        //从小到大的排序
        int i, j;
        int[] a = {2, 1, 4, 8, 9, 5, 3};
        for (i = 0; i < a.length - 1; i++) {    //循环索引0到5
            int k = i;  //k等于当前的i
            for (j = i; j < a.length; j++) {    //循环索引i到6
                if (a[j] < a[k]) {  //判断a[k]的值是否大于a[j]
                    k = j;  //是,k就保存小于a[k]的索引j
                }   //整个循环找到i到6的最小值
            }
            int temp = a[i];    //然后两值交换
            a[i] = a[k];
            a[k] = temp;
        }
        for (i = 0; i < a.length; i++) {    //输出数组a;
            System.out.print(a[i] + "");
        }
        System.out.println();
    }
}
