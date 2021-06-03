package 实训.实训上.面向对象1.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/18 8:34
 **/
public class Teacher {
    public String name, course, major;
    public int teachingAges;

    public void showTeacherInfo() {
        System.out.println("姓名：" + name + "\t课程：" + course + "\t主修：" + major + "\t教龄：" + teachingAges);
    }
}
