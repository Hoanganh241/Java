package task5;

public class Ball {
    private double x, y, xStep, yStep;

    //Constructor
    public Ball(double x, double y, double xStep, double yStep) {
        this.x = x;
        this.y = y;
        this.xStep = xStep;
        this.yStep = yStep;
    }

    //The public getters and setters
    public double getX() {
        return  this.x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return this.y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getxStep() {
        return this.xStep;
    }
    public void setxStep(double xStep) {
        this.xStep = xStep;
    }
    public double getyStep() {
        return this.yStep;
    }
    public void setyStep(double yStep) {
        this.xStep = yStep;
    }

    // Return a String o describe this instance
    public String toString(){
        return "Ball@(" + x + "," + y + "), speed = (" + xStep + "," + yStep + ")";
    }

}
