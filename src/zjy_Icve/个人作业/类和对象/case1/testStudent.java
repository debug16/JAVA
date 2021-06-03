package zjy_Icve.个人作业.类和对象.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 17:17
 **/
public class testStudent {
    public static void main(String[] args) {
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",21);
        Student s3 = new Student("王五",27);
        Student s4 = new Student("赵六",31);
        s1.show();
        s2.show();
        s3.show();
        s4.show();
    }
}
