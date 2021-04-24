package task8;

public class TestTriangle {
    public static void main(String[] args){

        Point A = new Point(4, 5);
        System.out.println("A is: " + A);
        Point B = new Point(7, 2);
        System.out.println("B is: " + B);
        Point C = new Point(3, 9);
        System.out.println("C is: " + C);

        Triangle t1 = new Triangle(A, B, C);
        if (((t1.getAb()+ t1.getAc()> t1.getBc()) && (t1.getAb()+ t1.getBc()> t1.getAc()) &&t1.getAc()+ t1.getBc()> t1.getAb())){
            System.out.println("Perimeter = " + t1.getPerimeter());
        }
    }
}
