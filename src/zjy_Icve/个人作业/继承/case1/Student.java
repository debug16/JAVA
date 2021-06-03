package zjy_Icve.个人作业.继承.case1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 10:16
 **/
public class Student extends Person {
    private float chinese, math, english;

    public Student(String id,String name,float chinese, float math, float english) {
        super(id, name);
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public float getChinese() {
        return chinese;
    }

    public void setChinese(float chinese) {
        this.chinese = chinese;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public void show() {
        super.show();
        System.out.printf("chinese=%.2f,math=%.2f,english=%.2f", this.chinese, this.math, this.english);
    }
}
