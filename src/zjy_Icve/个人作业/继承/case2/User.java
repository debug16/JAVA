package zjy_Icve.个人作业.继承.case2;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 10:52
 **/
public class User {
    private static int accountNum;
    private String userName, password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        accountNum++;
    }

    public static int getAccountNum() {
        return accountNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void show() {
        System.out.printf("userName = %s\tpapassword = %s\n", this.userName, this.password);
    }
}
