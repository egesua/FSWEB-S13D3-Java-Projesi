package com.egesua.oop;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double setWidth(double width){
        if(width <= 0){
            return 0;
        } else {
            return width;
        }
    }

    public double setHeight(double height){
        if(height <= 0){
            return 0;
        }
        else {
            return height;
        }
    }

    public double getArea(){
        return setWidth(width) * setHeight(height);
    }
}
