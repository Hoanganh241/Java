package task5;

public class Time {
    //The private instance variables
    private int second, minute, hour;

    //The constructors (overloaded)
    private Time(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    public Time() {
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }

    public int getSecond() {
        return this.second;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getHour() {
        return this.hour;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    //Return "hh/:mm:ss"
    public  String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    //Return second, minute, hour
    public void setTime(int second, int minute, int hour) {

        //No inout validation
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    //Increment this instance by one second, and return this instance.
    public Time nextSecond() {
        ++second;
        if (second >= 60) {
            second = 0;
            if ((minute >= 60)) {

                minute = 0;
            }
            if (hour >= 24) {
                hour = 0;
            }
        }
        return this;

    }

}