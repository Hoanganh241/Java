package task10;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        super();
        this.height = 1.0;
        System.out.println("Constructed a Cylinder with Cylinder()");
    }

    public Cylinder(double height) {
        super();
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height)");
    }
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius)");
    }
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString(double height) {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
    public String toString() {
        return "This is a Cylinder";
    }
}
