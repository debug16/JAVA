package 实训.实训上.面向对象4.case3;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/27 10:47
 **/
public abstract class HandSet {
    private String brand;//品牌
    private String type;//型号

    public HandSet(String brand, String type) {

        this.brand = brand;
        this.type = type;
    }

    public HandSet() {
        super();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void sendInfo();//发短信

    public abstract void call();//打电话

    public abstract void info();//显示品牌和型号
}
