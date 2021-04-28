package Exam;

public class Flight {

    private int number;
    private String destination;

    public Flight() {
        this.number = 0;
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public void display(){

        System.out.println("Số hiệu chuyến bay là: " + number);
        System.out.println("Nơi đến của bạn: " + destination);

    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }


}
