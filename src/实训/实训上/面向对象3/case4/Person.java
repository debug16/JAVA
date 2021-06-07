package 实训.实训上.面向对象3.case4;

import java.util.Objects;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/7 19:50
 **/
public class Person extends Object {
    private String name, age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("姓名：" + name + "年龄：" + age);
    }

    @Override
    public boolean equals(Object o) {   //姓名相等就相等
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

class test {
    public static void main(String[] args) {
        Person p1 = new Person("张三", "18");
        Person p2 = new Person("张三", "21");

        p1.display();
        p2.display();
        System.out.println("两个对象是否相等：" + p1.equals(p2));//
    }
}

