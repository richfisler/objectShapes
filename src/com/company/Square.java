package com.company;

import java.awt.*;

public class Square extends Shape {
    private int side;

    public Square(int x, int y, Color c, int h) {
        super(x,y,c);
        System.out.println("In Square Constructor");

        side=h;
    }
    public void getArea(){
        System.out.println("sQUARE ARE AIS " + side*side);
    }
    public int getSide(){
        return side;
    }
    public void draw(Graphics g){
        g.setColor(getC());
        g.fillRect(getX(),getY(),side,side);

    }
    @Override
    public boolean equals(Object o){
        if (o == null) return false;
        if (o.getClass() != this.getClass()) {
            return false;
        }
        return (((Square) o).getSide() == this.getSide());
    }
}
