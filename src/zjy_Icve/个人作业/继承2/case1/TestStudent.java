package zjy_Icve.个人作业.继承2.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 11:19
 **/
public class TestStudent {
    public static void main(String[] args) {
        Undergraduate me = new Undergraduate("小帅",18,"学士","软件工程");
        Undergraduate stu = new Undergraduate("小明",20,"学士","软件工程");
        Graduate tech = new Graduate("小美",25,"硕士","软件工程");
        System.out.println("本人信息：");
        me.show();
        System.out.println("\n同学信息：");
        stu.show();
        System.out.println("\n老师信息：");
        tech.show();
    }
}
