package task7;

public class Cylinder  extends Circle {
    //Private instance variable
    private double height;

    //Constructors
    public Cylinder() {
        super(); //invoke superclass' constructor Circle()
        this.height = 1.0;
        System.out.println("Constructed a Cylinder with Cylinder()"); //for debugging
    }
    public Cylinder(double height) {
        super(); //invoke superclass' constructor Circle()
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height)");
    }
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");
    }

    //Getter and Setter
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    /** Returns the volume of this Cylinder */

    /** Returns a self-descriptive String */
    public String toString() {
        return "This is a Cylinder";
    }
}
