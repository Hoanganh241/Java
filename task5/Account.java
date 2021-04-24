package task5;

public class Account {
    // The private instance variables
    private int accountNumber;
    private double balance;

    //The constructors (overloaded)
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Account(int accountNumber) { // with default balance
        this.accountNumber = accountNumber;
        this.balance = 0.0; //"this." optional
    }

    //The public getters/setters for the private instance variables.
    //No setter for accountNumber because it is not designed to be changed.
    public int getAccountNumber() {
        return this.accountNumber; //"this." optional
    }
    public double getBalance() {
        return this.balance;//"this." optional
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Add the given amount to the balance.
    public void credit(double amount) {
        balance += amount;
    }

    // Subtract the given amount from balance, if applicable.
    public void debit(double amount) {
        if (balance < amount) {
            System.out.println("amount withdraw exceeds the current balance!");
        }
        else {
            balance -= amount;
        }
    }

    //The toString() return a string description of this instance.
    public String toString() {
        //Use built-in function System.format() to from a formted String
        return String.format("A/C no:%d, Balance=%.2f", accountNumber, balance);
    }
}


