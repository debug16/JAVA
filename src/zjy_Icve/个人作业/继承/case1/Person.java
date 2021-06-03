package zjy_Icve.个人作业.继承.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 10:14
 **/
public class Person {
    public String id, name;

    public Person() {
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.printf("id=%s,name=%s ", this.id, this.name);
    }

}
