package zjy_Icve.个人作业.循环结构.case2;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 16:28
 **/
public class test2 {
    public static void main(String[] args) {
        //假设有1条绳子1000m，每天减去一半，请问需要几天时间，绳子的长度会短于5m。
        int conut = 0;//计数
        for (int i = 1000; i >= 5; i /= 2) {
            conut++;
        }
        System.out.printf("需要%d天绳子长度短于5m", conut);
    }
}
