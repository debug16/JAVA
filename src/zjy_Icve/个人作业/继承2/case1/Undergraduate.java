package zjy_Icve.个人作业.继承2.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 11:14
 **/
public class Undergraduate extends Student{
    public String specialty;

    public Undergraduate() {
    }

    public Undergraduate(String name, int age, String degree, String specialty) {
        super(name, age, degree);
        this.specialty = specialty;
    }

    public void show(){
        super.show();
        System.out.printf("专业：%s",specialty);
    }

}
