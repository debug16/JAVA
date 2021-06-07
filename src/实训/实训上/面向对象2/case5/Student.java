package 实训.实训上.面向对象2.case5;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/7 19:09
 **/
public class Student {
    private String sno;
    private String name;
    private int age;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String sno, String name, int age) {
        this.sno = sno;
        this.name = name;
        this.age = age;
    }
}
