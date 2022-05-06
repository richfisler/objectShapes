package com.company;

import java.awt.*;

public class Shape {
    private int centerX;
    private int centerY;
    private int dx,dy;
    private Color color;
    private double vx,vy;
    public Shape(){
        System.out.println("In Shape Constructor");

    }
    public Shape(int centerX, int centerY, Color c){
        this.centerX=centerX;
        this.centerY=centerY;
        this.color=c;
        vx=0.;
        vy=0.;
        System.out.println("In Shape Constructor with params");
        //getArea();
    }
    public int getRadius(){
        return 0;
    }
    public int getD(){
        return 0;
    }



    //public void getArea(){
      //  System.out.println("Area is 1.0");
    //}
    public void move(int dx, int dy){
        centerX+=dx;
        centerY+=dy;
        if ((centerX>490)||(centerX<10))vx=-1.0*vx;
        if (((centerY<10)||centerY>490))vy=vy*-1.0;
    }

    public void moveVel(double t){
        dx= (int) (vx*t);
        dy= (int) (vy*t);
        move(dx,dy);
    }
    public void setC(Color c){color = c;}
    public boolean isRed(){
        return (color==Color.RED);
    }
    public int getX(){return centerX;}
    public int getY(){return centerY;}
    public Color getC(){return color;}
    public void setX(int x){centerX=x;}
    public void setDx(int x){dx=x;}
    public void setDy(int x){dy=x;}
    public int getDx(){return dx;}
    public int getDy(){return dy;}

    public void setVel(int x,int y){
        vx=x;vy=y;
    }

    public void draw(Graphics g){


    }
}

