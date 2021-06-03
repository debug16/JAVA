package 实训.实训上.面向对象1.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/18 8:33
 **/
public class Student {
    public String className, name, hobby;
    public int age;

    public void showStudenInfo() {
        System.out.printf("姓名：" + name + "\t年龄：" + age + "\t班级：" + className + "\t爱好：" + hobby);
    }
}