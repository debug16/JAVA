package zjy_Icve.个人作业.继承.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 10:21
 **/
public class Teacher extends Person {
    private float wages;

    public Teacher(String id, String name, float wages) {
        super(id, name);
        this.wages = wages;
    }

    public float getWages() {
        return wages;
    }

    public void setWages(float wages) {
        this.wages = wages;
    }

    public void show() {
        super.show();
        System.out.printf("wages=%.2f", this.wages);
    }
}
