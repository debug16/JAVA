package 实训.实训下.String类使用.String类对象应用1;

import java.util.Scanner;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/4 9:26
 **/
public class UserInfoTest {
    public static void main(String[] args) {
        String name, passwoed;
        Scanner sc = new Scanner(System.in);
        UserInfo user = new UserInfo();

        System.out.println("请输入用户名：");
        name = sc.next().toUpperCase();
        System.out.println("请输入密码：");
        passwoed = sc.next().toUpperCase();//转大写

        if (passwoed.length() >= 6) {   //判断输入密码长度
            user.setuName(name);
            user.setPassword(passwoed.toUpperCase());

            System.out.printf("%s", user.chekUser(name, passwoed) ? "身份验证通过" : "身份验证失败");
        } else {
            System.out.println("密码长度小于6");
        }

    }
}
