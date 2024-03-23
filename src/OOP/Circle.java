package OOP;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.text.AttributedString;

public class Circle {

    private Point center;
    private int radius;
    private double area,circumference;

    public Circle(Point center , int radius){
        this.center = center;
        this.radius = radius;
        this.area = Math.PI * Math.pow(radius,2);
        this.circumference = 2 * Math.PI * radius;
    }


    public int getX(){
        return (int)this.center.getX();
    }

    public String getArea() {
        return "Area is " +  (int)area + "cm²";
    }

    public String getCircumference() {
        return "Circumference is " + (int)circumference + "cm²";
    }
}
