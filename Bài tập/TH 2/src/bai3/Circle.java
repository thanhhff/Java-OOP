package bai3;

import java.awt.*;

public class Circle {

    /**
     * A simple circle class
     *
     * @author Thanhhff
     * @version 1.0
     */

    int $char = 0;

    protected Color color;
    protected int diameter;

    public Circle(int diameter, Color color){
        this.diameter = diameter;
        this.setColor(color);
    }

    public Circle(int diameter){
        this.diameter = diameter;
        this.setColor(Color.blue);
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public static void main(String[] args){

    }
}
