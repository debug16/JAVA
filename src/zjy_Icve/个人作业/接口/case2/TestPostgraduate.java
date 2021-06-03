package zjy_Icve.个人作业.接口.case2;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 9:51
 **/
public class TestPostgraduate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Postgraduate postgraduate = new Postgraduate("张三","2021",18);
        System.out.print("请输入你的年收入和学费");
        postgraduate.setPay(sc.nextDouble());
        postgraduate.setFee(sc.nextDouble());
        if(postgraduate.getPay()>=postgraduate.getFee()){
            System.out.println("够了");
        }else {
            System.out.println("少了");
        }
    }
}
