package 实训.实训上.面向对象1.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/18 8:35
 **/
public class TextTeacherAndStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        Teacher t1 = new Teacher();
        s1.name = "张三峰";
        s1.age = 28;
        s1.className = "软件2001";
        s1.hobby = "软件开发";

        t1.name = "李老师";
        t1.course = "Java";
        t1.major = "软件工程";
        t1.teachingAges = 20;
        System.out.println("教师信息：");
        t1.showTeacherInfo();
        System.out.println("学生信息：");
        s1.showStudenInfo();
    }
}
