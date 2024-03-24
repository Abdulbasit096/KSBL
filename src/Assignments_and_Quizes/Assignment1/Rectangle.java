package Assignments_and_Quizes.Assignment1;

import java.awt.*;

public class Rectangle {
    private Point topLeft;
    private Point bottomRight;

    private Point topRight;
    private Point bottomLeft;

    private double height;
    private double width;


    public Rectangle(Point topLeft, Point bottomRight) {
        if (topLeft.x > bottomRight.x || topLeft.y < bottomRight.y) {
            System.out.println("Invalid vertices: top left must be left of bottom right.");
            return;
        }
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.topRight = new Point(this.bottomRight.x,this.topLeft.y);
        this.bottomLeft = new Point(this.topLeft.x,this.bottomRight.y);
        this.height = this.topLeft.y - this.bottomLeft.y;
        this.width = this.topRight.x - this.topLeft.x;
    }

    public double getArea(){

        return this.height * this.width;
    }
    public double getPerimeter(){
        return (this.height + this.width)*2;
    }

    public boolean isSquare(){
        return this.height == this.width;
    }

}
