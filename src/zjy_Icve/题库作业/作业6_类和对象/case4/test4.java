package zjy_Icve.题库作业.作业6_类和对象.case4;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 19:55
 **/
public class test4 {
    public static void main(String[] args) {
        Graduate graduate = new Graduate("202101","小帅","软件技术");
    }
}

class Student {
    public String sno, name;

    public Student(String sno, String name) {
        this.sno = sno;
        this.name = name;
    }
}

class Graduate extends Student {
    public String major;

    public Graduate(String sno, String name, String major) {
        super(sno, name);
        this.major = major;
    }

}
