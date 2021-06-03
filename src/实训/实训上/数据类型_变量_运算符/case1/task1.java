package 实训.实训上.数据类型_变量_运算符.case1;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/4/29 11:54
 **/
public class task1 {
    public static void main(String[] args) {
        phone myPhone = new phone("华为Meta8", 100f, "内置锂电池", 3850f, true);
        Scanner sc = new Scanner(System.in);
        myPhone.input();
    }

}

class phone {
    String brand, type;
    boolean doubleCamera;
    float price, weight;

    public phone(String brand, float weight, String type, float price, boolean doubleCamera) {
        this.brand = brand;
        this.weight = weight;
        this.type = type;
        this.price = price;
        this.doubleCamera = doubleCamera;
    }

    void input() {
        System.out.println("品牌（brand）:" + brand);
        System.out.println("重量（weight）:" + weight);
        System.out.println("电池类型（type）:" + type);
        System.out.println("价格（price）:" + price);
        System.out.println("双摄支持（doubleCamera）:" + doubleCamera);
    }
}

