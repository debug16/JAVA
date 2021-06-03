package 实训.实训上.面向对象4;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/27 10:45
 **/
public class penguin implements IAnimal{
    @Override
    public void walk() {
        System.out.println("两条腿跳着走.....");
    }

    @Override
    public void eat() {
        System.out.println("企鹅吃鱼.....");
    }
}
