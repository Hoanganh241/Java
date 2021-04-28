package Exam;

import java.util.Scanner;

public class Bank {
    private double balance;
    private double rate;

    public Bank() {
        this.balance = 0;
        this.rate = 0;
    }

    public Bank(double balance, double rate){
        this.balance = balance;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "balance=" + balance +
                ", rate=" + rate +
                '}';
    }

    public double interest(){
        return  balance * (rate/1200);
    }

}
