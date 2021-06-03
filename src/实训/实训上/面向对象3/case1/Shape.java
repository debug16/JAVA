package 实训.实训上.面向对象3.case1;

import java.awt.*;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/27 10:56
 **/
public class Shape {
    protected int lineSize;//线宽
    protected Color lineColore;//颜色

    public Shape(int lineSize, Color lineColore) {
        this.lineSize = lineSize;
        this.lineColore = lineColore;
    }

    public Shape() {// 构造方法1
        lineSize = 1;
        lineColore = Color.blue;
    }

    public int getLineSize() {
        return lineSize;
    }

    public void setLineSize(int lineSize) {
        this.lineSize = lineSize;
    }

    public Color getLineColore() {
        return lineColore;
    }

    public void setLineColore(Color lineColore) {
        this.lineColore = lineColore;
    }

    public void draw() {
        System.out.println("用宽度为" + lineSize + "颜色为" + lineColore + "的线画一个图形");
    }

}
