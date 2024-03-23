package OOP;

import java.awt.*;

public class MovePoints {
    private final Point initalPoint;
    private final Point currentPoint;

    public Point getCurrentPoint(){
        return this.currentPoint;
    }
    public Point getInitalPoint(){
        return this.initalPoint;
    }

    public MovePoints(Point initalPoint){
        this.initalPoint = initalPoint;
        this.currentPoint = new Point(this.initalPoint.x,this.initalPoint.y);
    }

    public MovePoints getLocation(){
        return (this);
    }

    public void moveUp(){
        this.currentPoint.setLocation(this.currentPoint.getX(),this.currentPoint.getY()+1);
    }
    public void moveDown(){
        this.currentPoint.setLocation(this.currentPoint.getX(),this.currentPoint.getY()-1);
    }
    public void moveLeft(){
        this.currentPoint.setLocation(this.currentPoint.getX()-1,this.currentPoint.getY());
    }
    public void moveRight(){
        this.currentPoint.setLocation(this.currentPoint.getX()+1,this.currentPoint.getY());
    }

    public double getDisplacement(){
        return this.currentPoint.distance(this.initalPoint);
    }






}
