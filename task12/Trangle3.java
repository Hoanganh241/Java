package task12;

public class Trangle3 implements Shape3{
    private int base, height;

    public Trangle3(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Trangle3{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
