package zjy_Icve.个人作业.继承.case2;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 10:59
 **/
public class testUser {
    public static void main(String[] args) {
        User user1 = new User("张三", "123456789");
        User user2 = new User("李四", "1234567");
        User user3 = new User("王五", "12345");
        User user4 = new User("赵六", "6789");
        user1.show();
        user2.show();
        user3.show();
        user4.show();
        System.out.printf("已经实例了%d个对象！", User.getAccountNum());

    }
}
