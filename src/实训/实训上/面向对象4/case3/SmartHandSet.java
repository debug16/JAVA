package 实训.实训上.面向对象4.case3;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/7 20:07
 **/
//智能手机
//智能手机 实现 上网 拍照
public class SmartHandSet extends HandSet implements NetWork, TakingPictures {
    @Override
    public void takingPictures() {
        System.out.println("拍照");
    }

    @Override
    public void conn() {
        System.out.println("上网");
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

