package task5;

public class TestAcocunt {
    public static void main(String[] args) {
        // Test Constructors and toString()
        Account a1 = new Account(1234, 99.99);
        System.out.println(a1); //toString
        Account a2 = new Account(8888);
        System.out.println(a2); //toString

        //Test Setters and Getters
        a1.setBalance(88.88);;
        System.out.println(a1);
        System.out.println("The account number is: " + a1.getAccountNumber());
        System.out.println("The balance is: " + a1.getBalance());

        //Test credit() and debit()
        a1.credit(10);
        System.out.println(a1); // run toString() to inspect the modified instance
        a1.debit(5);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);
    }
}
