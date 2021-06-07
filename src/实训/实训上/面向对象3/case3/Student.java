package 实训.实训上.面向对象3.case3;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/7 19:38
 **/
public class Student {
    private String sno,name;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

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

    public Student(String sno, String name) {
        this.sno = sno;
        this.name = name;
    }
}
