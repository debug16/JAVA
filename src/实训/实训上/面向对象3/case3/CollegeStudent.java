package 实训.实训上.面向对象3.case3;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/7 19:39
 **/
public class CollegeStudent extends Student {
    private String professional;//专业

    public CollegeStudent() {
    }

    public CollegeStudent(String sno, String name, String professional) {
        super(sno, name);
        this.professional = professional;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "professional='" + professional + '\'' +
                '}';
    }


    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }
}
