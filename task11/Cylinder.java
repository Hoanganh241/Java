package task11;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return super.getArea() * height;
    }
    @Override
    public double getArea() {
        return 2.0 * Math.PI * getRadius() * height;
    }
    @Override
    public String toString() {
        return "Cylinder[height=" + height + "," + super.toString() + "]";
    }
    public static void main(String[] args){
        Circle c1 = new Cylinder(1.1, 2.2);
        System.out.println(c1.getRadius());
        System.out.println(c1.toString());
        System.out.println(c1.getArea());
    }
}
