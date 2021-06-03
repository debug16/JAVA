package 实训.实训上.面向对象3.case1;

import java.awt.*;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/1 8:35
 **/
public class Rectangle extends Shape {
    private int left; // 矩形左上角X坐标
    private int top; // 矩形左上角Y坐标
    private int width; // 矩形长度
    private int height; // 矩形宽度


    public Rectangle(int left, int top, int width, int height) {
        super();
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }


    public Rectangle() {
        super();
    }

    public Rectangle(int ls, Color color) {
        super(ls, color);
    }

    public void draw() {// 覆盖父类的draw()方法
        System.out.println("用宽度为" + lineSize + "，颜色为" + lineColore + "的线条画一个矩形");
    }

    //求周长
    public double getPerimeter() {
        return (width + height) * 2;
    }

    //求面积
    public double getArea() {
        return width * height;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
