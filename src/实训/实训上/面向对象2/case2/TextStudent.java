package 实训.实训上.面向对象2.case2;


/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/18 8:35
 **/
public class TextStudent {
    public static void main(String[] args) {
        Student s1 = new Student("王芳",19,"计软2019-1","旅游");
        Student s2 = new Student("张小明",19,"计软2001-1","篮球");

        System.out.println("学生信息：");
        s1.showStudenInfo();
        s1.learning("javaWeb程序设计");
        System.out.println("学生信息：");
        s2.showStudenInfo();
        s2.learning("javaWeb程序设计");
    }
}
