package Exam;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Gheo căm tu mai banh!");
        Bank bank1 = new Bank(200, 1000);
        System.out.println(bank1.toString());
        System.out.println("Nhập số tiền bạn muốn gửi: ");
        double balance = scan.nextDouble();
        System.out.println("Nhập lãi suất bạn muốn: ");
        double rate = scan.nextDouble();

        System.out.println("Tống số tiền cả gốc lẫn lãi là: " + bank1.interest() );
    }
}
