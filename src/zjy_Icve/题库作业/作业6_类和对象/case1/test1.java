package zjy_Icve.题库作业.作业6_类和对象.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 17:52
 **/
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.printf("姓名：%s\t年龄：%d", name, age);
    }

}

public class test1{
    public static void main(String[] args) {
        Person person = new Person("张三",20);
        person.display();
    }
}