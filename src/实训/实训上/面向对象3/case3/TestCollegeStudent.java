package 实训.实训上.面向对象3.case3;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/7 19:46
 **/
public class TestCollegeStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CollegeStudent collegeStudent = new CollegeStudent();

        System.out.println("请输入学号：");
        collegeStudent.setSno(sc.nextLine());
        System.out.println("请输入姓名：");
        collegeStudent.setName(sc.nextLine());
        System.out.println("请输入专业：");
        collegeStudent.setProfessional(sc.nextLine());

        System.out.printf("学号:%s\t姓名:%s\t专业:%s\n", collegeStudent.getSno(), collegeStudent.getName(), collegeStudent.getProfessional());

    }
}
