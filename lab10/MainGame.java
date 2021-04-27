package lab10;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập tên mèo: ");
        String name = scan.nextLine();
        System.out.println("Nhập tốc độ chạy của mèo");
        int speed = scan.nextInt();
        Cat c1 = new Cat(name, speed);

        System.out.println("Nhập tên chuột: ");
        String ten = scan.nextLine();
        System.out.println("Tốc độ chạy của chuột: ");
        int td = scan.nextInt();
        System.out.println("Nhập cân nặng của chuột: ");
        int weight = scan.nextInt();
        Rat r1 = new Rat(ten, td, weight);
        if (c1.getSpeed() <= r1.getSpeed()){
            r1.run();
            System.out.println("Không bắt được chuột nên chịu đói");
            System.out.println("Chuột vẫn còn chơi tiếp");
        }
        else {
            c1.run();
            System.out.println("Đã hết chuột! Hết phim");
        }

    }
}
