package 实训.实训上.数据类型_变量_运算符.case3;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/4/30 9:43
 **/
public class task3 {
    public static void main(String[] args) {
        Pay shoppList = new Pay();
        shoppList.shopp();
    }
}

class Pay {
    float tx, wqx, wqp, totalAmount, pay, discount = 0.8f;
    int integral;   //积分
    int txNum, wqxNum, wqpNum;  //各商品购物数量

    void putShoppList() {       //输出购物列表
        System.out.println("\n***************购物列表***************");
        System.out.println("序号\t物品列表\t单价");
        System.out.println(String.format("%-2s", "1") + "\t" + String.format("%-3s", "T恤") + "\t" + String.format("%-4s", "￥245"));
        System.out.println("2\t网球鞋\t￥570");
        System.out.println("3\t网球拍\t￥350\n");
    }

    void shoppList() {  //打印购物清单
        System.out.println("***************消费清单***************");
        System.out.println("序号\t购买物品\t单价  \t数量  金额");
        System.out.println("1\t" + String.format("%-3s", "T恤") + "\t" + "￥245\t" + txNum + "\t￥" + this.tx);
        System.out.println("2\t网球鞋\t￥570\t" + wqxNum + "\t￥" + this.wqx);
        System.out.println("3\t网球拍\t￥350\t" + wqpNum + "\t￥" + this.wqp);
        System.out.println("折扣：\t" + this.discount * 10 + "折");
        System.out.println("消费总金额：\t￥" + this.totalAmount);
        System.out.println("缴费金额：\t￥" + this.pay);
        System.out.println("找零：\t￥" + (this.pay - this.totalAmount));
        System.out.println("本次购物所获积分：\t" + this.integral);
    }

    float shopp() {
        Scanner input = new Scanner(System.in);
        int num;
        boolean flag = true;
        while (flag) {
            this.putShoppList();
            System.out.print("请输入你要购买的商品序号（输入0退出）：");
            num = input.nextInt();
            switch (num) {
                case 1 -> {
                    this.txNum++;
                    this.tx += 245;
                }
                case 2 -> {
                    this.wqx += 570;
                    this.wqxNum++;
                }
                case 3 -> {
                    this.wqp += 350;
                    this.wqpNum++;
                }
                case 0 -> {
                    flag = false;
                    this.totalAmount = (this.tx + this.wqp + this.wqx) * this.discount;
                    this.integral = (int) (this.totalAmount / 33);
                }
                default -> System.out.println("你的输入有误！");
            }
        }
        System.out.println("你一共消费了：\t￥" + this.totalAmount);
        System.out.println("请输入你的缴费金额：");
        while (true) {
            pay += input.nextFloat();
            if (this.pay < this.totalAmount) {
                System.out.print("缴费金额不够请补缴：");
            } else {
                shoppList();
                return this.totalAmount;
            }
        }
    }
}