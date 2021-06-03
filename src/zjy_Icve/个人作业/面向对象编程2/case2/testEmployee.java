package zjy_Icve.个人作业.面向对象编程2.case2;

import zjy_Icve.个人作业.面向对象编程2.case1.Employee;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 23:59
 **/
public class testEmployee {
    public static void main(String[] args) {
        Employee[] t = {
                new Employee("小美", 'F', 8000),
                new Employee("小白", 'M', 10900),
                new Employee("小帅", 'M', 7050),
                new Employee("小明", 'M', 8900)
        };

        //输出
        Employee.show(t);


    }
}
