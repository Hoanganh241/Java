package task5;
/*
*A test drive for the Date class.
 */

public class TestDate {
    public static void main (String[] args) {
        //Test constructors and toString()
        Date d1 = new Date(2020, 4, 6);
        System.out.println(d1); //toString()

        // Test Setters and Getters
        d1.setYear(2012);
        d1.setMonth(12);
        d1.setDay(23);
        System.out.println("Year is: " + d1.getYear());
        System.out.println("month is:" + d1.getMonth());
        System.out.println("Day is: " + d1.getDay());

        //Test setDate()
        d1.setDat(2988, 1, 2);
        System.out.println(d1);
    }
}
