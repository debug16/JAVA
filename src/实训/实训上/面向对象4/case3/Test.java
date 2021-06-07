package 实训.实训上.面向对象4.case3;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/7 20:07
 **/
public class Test {
    public static void main(String[] args) {
        CommonHandSet common = new CommonHandSet();
        common.call();
        common.sendInfo();
        common.play("学猫叫");
        System.out.println("********************");
        SmartHandSet shs = new SmartHandSet();
        shs.setBrand("三星 Galaxy S9");
        shs.setType("128G");
        shs.call();
        shs.sendInfo();
        shs.takingPictures();
        shs.conn();
        shs.info();
    }
}

