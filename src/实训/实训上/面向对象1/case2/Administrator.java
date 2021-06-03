package 实训.实训上.面向对象1.case2;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/18 8:58
 **/
public class Administrator {
    public String userName, password;

    public void showAdminInfo() {
        System.out.println("管理员信息：\n" + "用户名：" + userName + "\t密码：" + password);
    }

    public boolean login(String userName,String password){
        return userName.equals("admin") && password.equals("123456");
    }

}
