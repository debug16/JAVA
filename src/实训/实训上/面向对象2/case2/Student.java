package 实训.实训上.面向对象2.case2;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/18 8:33
 **/
public class Student {
    private String name, className, hobby,id;
    private int age;

    public Student(String name, int age, String className, String hobby) {
        super();
        this.className = className;
        this.name = name;
        this.hobby = hobby;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void showStudenInfo() {
        System.out.println("姓名：" + name + "\t年龄：" + age + "\t班级：" + className + "\t爱好：" + hobby);
    }

    public void learning(String kcName) {
        System.out.println(name + "正在参加" + kcName + "的学习！");
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}