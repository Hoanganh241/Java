package task7;

import java.util.Currency;

public class TestCylinder {
    private static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        //Constructed a Circle with Circle()
        //Constructed a Cylinder with Cylinder()
        System.out.println("Radius is " + cy1.getRadius() + ", Height is" +cy1.getHeight() + "color is: " + cy1.getColor() + ", Base area is " + cy1.getArea() + ", Volume is " );

        //Radius is 1.0, Height í 1.0, Color is red,
        //Base area is 3.121592653589793, Volume is 3.1212222222
        Cylinder cy2 = new Cylinder(5.0, 2.0);
        //Constructed a Circle with Circle(radius)
        //Constructed a Cylinder with Cylinder(height, radius)
        System.out.println("Radius is " + cy2.getRadius() + ", Height is " + cy2.getHeight() + ", Color is " + cy2.getColor() + ", Base area is " + cy2.getArea() + ", Volume is ");
    }
}
