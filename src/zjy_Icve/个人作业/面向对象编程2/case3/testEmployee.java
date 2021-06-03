package zjy_Icve.个人作业.面向对象编程2.case3;

import zjy_Icve.个人作业.面向对象编程2.case1.Employee;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 0:08
 **/
public class testEmployee {
    public static void main(String[] args) {
        Employee[] t = {
                new Employee("小美", 'F', 8000),
                new Employee("小白", 'M', 10900),
                new Employee("小帅", 'M', 7050),
                new Employee("小明", 'M', 8900)
        };


        //输出教师信息
        Employee.show(t);   //静态方法输出信息

        System.out.printf("平均工资：%.2f\n", ave(t));
        System.out.printf("最高工资：%.2f\n", maxWage(t));
        System.out.printf("最低工资：%.2f\n", minWage(t));

    }

    public static double ave(Employee[] t) {
        double wage = 0;
        for (Employee i : t) {
            wage += i.getWage();    //全部教师总工资
        }
        return (wage / t.length);
    }

    public static double maxWage(Employee[] t) {
        if (t.length >= 1) {
            double wage = t[0].getWage();
            for (Employee i : t) {
                if (i.getWage() > wage) wage = i.getWage();
            }
            return wage;
        } else
            return -1;
    }

    public static double minWage(Employee[] t) {
        if (t.length >= 1) {
            double wage = t[0].getWage();
            for (Employee i : t) {
                if (i.getWage() < wage) wage = i.getWage();
            }
            return wage;
        } else
            return -1;
    }
}
