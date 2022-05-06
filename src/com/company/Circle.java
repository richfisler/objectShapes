package com.company;

import java.awt.*;

public class Circle extends Oval{
    private int r;
    public Circle (int x, int y, Color c, int r,int vx,int vy){
        super (x, y, c,r,r);
        this.r =r;
        super.setVel(vx,vy);
    }
    public int getD(){
        return r*2;
    }
}
