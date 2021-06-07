package 实训.实训上.面向对象4.case3;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/7 20:06
 **/
//普通手机
public class CommonHandSet extends HandSet implements Play {
    @Override
    public void play(String content) {
        System.out.println("播放" + content);
    }

    @Override
    public void sendInfo() {
        System.out.println("发送信息");
    }

    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void info() {
        System.out.println("手机品牌" + super.getBrand());
        System.out.println("手机的型号" + super.getType());
    }
}
