package zjy_Icve.个人作业.构造方法.case2;

import zjy_Icve.个人作业.构造方法.case1.Simple;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 16:34
 **/
public class Main {
    public static void main(String[] args) {
        Simple aSimple = new Simple();
        aSimple.setName("张三");
        aSimple.setAge(10);
        aSimple.setResults(99.5);
        System.out.println("姓名：" + aSimple.getName());
        System.out.println("年龄：" + aSimple.getAge());
        System.out.println("成绩:" + aSimple.getResults());
    }
}
