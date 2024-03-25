package Assignments_and_Quizes.Assignment1;

import java.awt.*;

public class Plane {

    private int fuel;
    
    private Point position;
    
    
    public Plane(Point position){
        this.fuel = 100;
        this.position = position;
    }

    public void moveUp(){
        spentFuel();
        this.position.setLocation(this.position.getX(),this.position.getY()+1);
    }
    public void moveDown(){
        spentFuel();
        this.position.setLocation(this.position.getX(),this.position.getY()-1);
    }
    public void moveLeft(){
        spentFuel();
        this.position.setLocation(this.position.getX()-1,this.position.getY());
    }
    public void moveRight(){
        spentFuel();
        this.position.setLocation(this.position.getX()+1,this.position.getY());
    }

    public void refill(){
        this.fuel = 100;
    }

    public void spentFuel(){
        this.fuel -= 2;
    }

    public void fire(){
        System.out.println("Fire!!");
    }


}
