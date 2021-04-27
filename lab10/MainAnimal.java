package lab10;

import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Bird b1 = new Bird("sau");
        b1.toString();
        Fish f1 = new Fish("An");
        f1.toString();
        Tiger t1 = new Tiger("trang");
        t1.toString();
        b1.fly();
        t1.run(30);
        f1.swim();
        System.out.println("Nhap tong khoi luong htuc an: ");
        int mass = scan.nextInt();
        Food m1 = new Food(mass);
        Animal a1 = new Animal(m1);
        System.out.println("Luong thuc an cho 1 lan la: ");
        int m = scan.nextInt();
        a1.eat(m1, m);


    }
}
