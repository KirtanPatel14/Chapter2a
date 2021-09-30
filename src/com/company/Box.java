package com.company;

import java.sql.SQLOutput;

public class Box {
    private double height;
    private double width;
    private double length;
    private String color;
    private boolean hasAlid;

    public Box (double h, double w, double l, String c, boolean lid){
        height = h;
        width = w;
        length = l;
        color = c;
        hasAlid = lid;

    }
    public Box (double h, double w, double l){
        height = h;
        width = w;
        length = l;
        color = "white";
        hasAlid = true;
    }
    public Box (){
        height = 1.0;
        width = 1.0;
        length = 1.0;
        color = "white";
        hasAlid = false;
    }


    // accessor methods
    public void setHeight(double h){
        if(h >0) {
            height = h;
        }
    }


    public double getHeight(){
        return height;
    }
    public double volume(){
        return length*width*height;
    }
public String toString(){
        String s = "a box with dimensions " + height + " " + width + "  "+length;
        s+= " it's color is "+ color + " and it has a lid " + hasAlid;
        return s;
}

    public static void main(String[] args) {
        Box b1 = new Box(5.4,3,7,"red", false);
        Box b2 = new Box(4.3, 3.7, 7.8);
        Box b3 = new Box();

        System.out.println(b1.getHeight());
        b1.setHeight(-37);
        System.out.println(b1.getHeight()+ " "+b2.volume());
        System.out.println(b1.volume());
        System.out.println(b2.volume());
        System.out.println(b3.volume());

        int x = 5;
        String name = "berry bop";
        System.out.println(x);
        System.out.println(b1);
    }
}

