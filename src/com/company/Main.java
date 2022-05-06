package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main extends JFrame {
    ArrayList<Shape> circlelist = new ArrayList<>();


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //myCircle.draw(g);
        for(Shape c : circlelist){
            c.draw(g);
        }
    }

    public Main() {
        setSize(500, 500);
        setVisible(true);
        setTitle("A cool window");
        circlelist.add(new Circle(100,200,Color.BLUE,20,5,5));
        circlelist.add(new Circle(10,20,Color.BLUE,40,10,-3));
        ActionListener updateTask = evt -> {
            for (int i = 0 ; i < circlelist.size() - 1 ; i++){
                if ((circlelist.get(i).getX() < circlelist.get(i+1).getX() + circlelist.get(i+1).getD() && circlelist.get(i).getX() > circlelist.get(i+1).getX())
                        ||((circlelist.get(i).getX() + circlelist.get(i).getD() < circlelist.get(i+1).getX() + circlelist.get(i+1).getD() && circlelist.get(i).getX() + circlelist.get(i).getD() > circlelist.get(i+1).getX()))
                        && (circlelist.get(i).getY() < circlelist.get(i+1).getY() + circlelist.get(i+1).getD() && circlelist.get(i).getY() > circlelist.get(i+1).getY())
                        ||((circlelist.get(i).getY() + circlelist.get(i).getD() < circlelist.get(i+1).getY() + circlelist.get(i+1).getD() && circlelist.get(i).getY() + circlelist.get(i).getD() > circlelist.get(i+1).getY()))){
                    circlelist.get(i).setC(Color.BLUE);
                    circlelist.get(i+1).setC(Color.BLUE);
                }
                else{
                    circlelist.get(i).setC(Color.RED);
                    circlelist.get(i+1).setC(Color.RED);
                }
            }
            for (Shape c : circlelist) {
                if (c.getX() >= 500 - c.getD()|| c.getX() <= 0) {
                    c.setDx(-c.getDx());
                }
                if (c.getY() >= 500 - c.getD()|| c.getY() <= 0) {
                    c.setDy(-c.getDy());
                }
                c.moveVel(1.0);
                repaint();
            }
        };
        new Timer(10, updateTask).start();
    }

    public static void main(String[] args) {
        Main main = new Main();

    }
}
