package task12;

public class demoTriangle {
    public static void main(String[] args){
        Shape s1 = new Triangle("red", 4, 5);
        System.out.println("Area is " + s1.getArea());

        Shape s2 = new Rectangle("green", 4, 5);
        System.out.println("Are is " + s2.getArea());
    }
}
