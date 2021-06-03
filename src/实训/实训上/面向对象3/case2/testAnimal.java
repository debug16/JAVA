package 实训.实训上.面向对象3.case2;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/1 9:06
 **/
public class testAnimal {
    public static void main(String[] args) {
        Goat goat = new Goat();
        System.out.println("山羊：");
        goat.eat();
        goat.walk();

        Wolf wolf =new Wolf();
        System.out.println("狐狸：");
        wolf.eat();
        wolf.walk();
    }
}
