package 实训.实训上.面向对象1.case3;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/18 9:32
 **/
public class Visitor {
    public String name;
    public int age;

    public void showVisitorInfo() {
        System.out.println("游客姓名：" + name + "\t年龄：" + age);
        
    }
}
