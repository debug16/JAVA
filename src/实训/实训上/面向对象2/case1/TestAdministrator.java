package 实训.实训上.面向对象2.case1;


import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/18 8:59
 **/
public class TestAdministrator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Administrator admin1 = new Administrator();
        //设置用户名密码
        admin1.userName = "admin";
        admin1.password = "123456";

        //输出管理员信息
        admin1.showAdminInfo();

        String scPassword;
        String scUserName;

        for (int i = 3; i > 0; i--) {
            System.out.print("请输入管理员用户名：");
            scUserName = sc.nextLine();
            System.out.print("请输入管理员密码：");
            scPassword = sc.nextLine();
            if (!admin1.login(scUserName, scPassword)) {
                if ((i - 1) == 0) {
                    System.out.println("登录失败！");
                    break;
                }
                System.out.println("用户名或密码错误，你还有" + (i - 1) + "次机会！");
            } else {
                System.out.println("登录成功！");
                break;
            }

        }

    }
}
