package 实训.实训上.面向对象1.case3;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/18 9:34
 **/
public class TestVisitor {
    public static void main(String[] args) {
        Visitor v1 = new Visitor();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入游客的姓名：");
        v1.name = sc.nextLine();

        //判断姓名是否为空
        if ((!v1.name.trim().isEmpty())) {
            System.out.print("请输入游客的年龄：");
            v1.age = sc.nextInt();
            if (v1.age <= 12 || v1.age >= 60) {
                System.out.println("门票免费!");
            } else {
                System.out.println("门票20元");
            }
        } else {
            System.out.println("姓名为空！");
        }


    }
}
