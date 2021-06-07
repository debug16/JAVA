package 实训.实训下.String类使用.String类对象应用1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/4 9:22
 **/
public class UserInfo {
    private String uName, password;

    public boolean chekUser(String uName, String password) {
        return (uName.equals("admin".toUpperCase()) && password.equals("123456".toUpperCase()));
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
