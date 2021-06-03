package zjy_Icve.个人作业.面向对象编程2.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 23:51
 **/
public class Employee {
    private String name;//姓名
    char sex;//性别
    private double wage;//工资

    public Employee() {
    }

    public Employee(String name, char sex, double wage) {
        this.name = name;
        this.sex = sex;
        this.wage = wage;
    }

    public static void show(Employee t) {
        System.out.printf("姓名：%s\t性别：%s\t工资：%.2f\n", t.name, t.sex, t.wage);
    }

    public static void show(Employee[] t) {
        for (Employee i : t) {
            System.out.printf("姓名：%s\t性别：%s\t工资：%.2f\n", i.name, i.sex, i.wage);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}
