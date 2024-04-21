package OOP;

public class Point2 {
    private double x;
    private double y;


    public Point2() {
        this.x = 0;
        this.y = 0;
    }


    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public void movex(double newX) {
        double distanceBefore = calculateDistanceFromOrigin();
        this.x = newX;
        double distanceAfter = calculateDistanceFromOrigin();
        System.out.println("Moved x to " + newX + ". Distance change: " + (distanceAfter - distanceBefore));
    }


    public void movey(double newY) {
        double distanceBefore = calculateDistanceFromOrigin();
        this.y = newY;
        double distanceAfter = calculateDistanceFromOrigin();
        System.out.println("Moved y to " + newY + ". Distance change: " + (distanceAfter - distanceBefore));
    }


    public void move(double newX, double newY) {
        double distanceBefore = calculateDistanceFromOrigin();
        this.x = newX;
        this.y = newY;
        double distanceAfter = calculateDistanceFromOrigin();
        System.out.println("Moved to (" + newX + ", " + newY + "). Distance change: " + (distanceAfter - distanceBefore));
    }


    private int calculateDistanceFromOrigin() {
        return (int)Math.sqrt(x * x + y * y);
    }
}
