package zjy_Icve.个人作业.类和对象.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 17:14
 **/
public class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.printf("姓名:%s\t年龄:%d\n", name, age);
    }
}
