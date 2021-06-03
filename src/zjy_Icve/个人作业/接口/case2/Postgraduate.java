package zjy_Icve.个人作业.接口.case2;

import java.util.Objects;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 9:38
 **/
public class Postgraduate implements studenIterface, TeacherInterface {
    private String name, id;
    private int age;
    private double tuition, pay;

    public Postgraduate(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Postgraduate that = (Postgraduate) o;
        return Double.compare(that.age, age) == 0 && Double.compare(that.tuition, tuition) == 0 && Double.compare(that.pay, pay) == 0 && Objects.equals(name, that.name) && Objects.equals(id, that.id);
    }


    @Override
    public String toString() {
        return "Postgraduate{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", tuition=" + tuition +
                ", pay=" + pay +
                '}';
    }

    @Override
    public double getPay() {
        return pay;
    }

    @Override
    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public double getFee() {
        return tuition;
    }

    @Override
    public void setFee(double tuition) {
        this.tuition = tuition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
