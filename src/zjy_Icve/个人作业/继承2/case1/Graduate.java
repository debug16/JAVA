package zjy_Icve.个人作业.继承2.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 11:16
 **/
public class Graduate extends Student{
    public String direction;

    public Graduate(String name, int age, String degree, String direction) {
        super(name, age, degree);
        this.direction = direction;
    }

    public void show(){
        super.show();
        System.out.printf("研究方向：%s",direction);
    }
}
