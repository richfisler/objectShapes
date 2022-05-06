package com.company;

import java.awt.*;

public class Oval extends Shape {
    private int height;
    private int width;
    public Oval(){
        height = 9;
        width = 9;
    }
    public Oval(int x, int y, Color c,int h,int w) {
           super(x,y,c);
            height=h;
            width=w;
        System.out.println("In Oval Constructor");


    }
    public void getArea(){
    }
    public int getRadius(){
        return height;
    }
     public void draw(Graphics g){
        g.setColor(getC());
        g.drawOval(getX(),getY(),width ,height);

    }

}
