package com.company;

import java.awt.*;

public class FilledOval extends Oval {
    private int height;
    private int width;

    public FilledOval(int x, int y, Color c, int h, int w) {
        super(x,y,c,h,w);
        height=h;
        width=w;
        System.out.println(" In filled oval constructor");
    }

    public void draw(Graphics g){
        g.setColor(getC());
        g.fillOval(getX(),getY(),width,height);

    }

}
