package task12;

public class Rectangle3 implements Shape3 {
    private int length, width;

    public Rectangle3(int length) {
        this.length = length;
    }
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width" + "]";
    }
    public double getArea() {
        return length * width;
    }
}
