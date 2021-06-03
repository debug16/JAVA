package bookExercises.train79p_3;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/18 11:42
 **/
public class train79p_3_2 {
    private String sNO,sName;
    private char sSex;
    private int sAge,sJava;
    public train79p_3_2(String no,String name,char sex,int age,int java){
        this.sName = name;
        this.sNO = no;
        this.sSex = sex;
        this.sAge = age;
        this.sJava = java;
    }

    public String getNO() {
        return sNO;
    }

    public String getName() {
        return sName;
    }

    public char getSex() {
        return sSex;
    }

    public int getAge() {
        return sAge;
    }

    public int getJava() {
        return sJava;
    }
}
