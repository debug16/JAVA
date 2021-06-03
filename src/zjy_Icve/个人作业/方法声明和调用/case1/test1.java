package zjy_Icve.个人作业.方法声明和调用.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 15:28
 **/
public class test1 {
    public static void main(String[] args) {
        Num n = new Num(10, 30);

        System.out.printf("改变前:\nnum1 = %d,num2 = %d\n", n.num1, n.num2);
        n.exchange();
        System.out.printf("改变后：\nnum1 = %d,num2 = %d\n", n.num1, n.num2);
    }

}

class Num {
    public int num1, num2;

    public Num(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Num() {

    }

    public void exchange() {
        this.num1 = (this.num1 + this.num2) - (this.num2 = this.num1);
    }
}