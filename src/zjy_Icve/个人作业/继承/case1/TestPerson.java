package zjy_Icve.个人作业.继承.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 10:25
 **/
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("1000", "me");
        Student student = new Student("2021", "张三", 99f, 98f, 99.5f);
        Teacher teacher = new Teacher("2000", "小美", 100000f);
        System.out.println("本人信息：");
        person.show();
        System.out.println("\n相邻同学信息：");
        student.show();
        System.out.println("\n老师信息：");
        teacher.show();
    }
}

