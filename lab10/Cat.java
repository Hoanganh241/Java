package lab10;

import java.util.Scanner;
import java.util.SortedMap;

public class Cat extends Animal {
    private int speed;
    private  Rat food;
    public Cat(String name, int speed) {
        super(name);
        this.speed = speed;
        this.food = food;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void eat(Rat food){
        if(food.getWeight() >=100){
            System.out.println("Mum mum! Chuột béo đấy!");
        }
        else {
            System.out.println("Mum mum! Chuột hơi gầy!");
        }
    }

    public boolean Catch(Rat a){
        return false;
    }

    public void run(){
        System.out.println("Đã tóm được chuột");
    }
}
