package task10;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.color = "red";
        this.radius = 1.0;
        System.out.println("Constructed a Circle with Circle()");
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
        System.out.println("Constructed a Circle with Circle (radius)");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        System.out.println("Constructed a Circle with Circle (radius, color)");
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
}