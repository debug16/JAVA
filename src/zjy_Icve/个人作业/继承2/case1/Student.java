package zjy_Icve.个人作业.继承2.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 11:08
 **/
public class Student {
    public String name,  degree;
public int age;
    public Student() {
    }

    public Student(String name, int age, String degree) {
        this.name = name;
        this.age = age;
        this.degree = degree;
    }

    public void show() {
        System.out.printf("姓名：%s\t年龄：%d\t学位：%s\t", name, age, degree);
    }
}
