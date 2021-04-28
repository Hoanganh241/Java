package Exam;

import java.util.Scanner;

public class MainFlight {
    public static void main(String[] args) {

        Flight g1  = new Flight(3821, "DAL");
        g1.display();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you number: ");
        int number = scan.nextInt();
        System.out.println("Enter your Destination: ");
        double destination = scan.nextDouble();
    }
}
