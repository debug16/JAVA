package 实训.实训上.面向对象4;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/27 10:43
 **/
public class Goat implements IAnimal{
    @Override
    public void walk() {
        System.out.println("四条腿走路.....");
    }

    @Override
    public void eat() {
        System.out.println("山羊吃草......");

    }
}
