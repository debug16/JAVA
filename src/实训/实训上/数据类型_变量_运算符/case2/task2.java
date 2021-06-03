package 实训.实训上.数据类型_变量_运算符.case2;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/4/30 1:26
 **/
public class task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请依此输入你的java成绩、数据库成绩、数据结构成绩（空格分隔）：");
        Course course = new Course(sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println("你的平均分为：" + course.getAverage());
        System.out.println("java和sql的分数差为：" + course.getDifference());
    }

}

class Course {
    float java, sql, data;

    public Course(float java, float sql, float data) {
        this.java = java;
        this.sql = sql;
        this.data = data;
    }

    float getAverage() {
        return ((java + sql + data) / 3);
    }

    float getDifference() {
        return java - sql;
    }
}