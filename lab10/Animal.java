package lab10;

import javax.naming.Name;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class Animal {
   private String name;
   private Food food;

   public Animal(String name){
       this.name = name;
       System.out.println("Ten con vat moi la: " + name);
   }

   public Animal(Food food) {
       this.food = food;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food getFood() {
        return food;
    }
    protected void eat(Food food, int m){
       food.conlai(m);
        System.out.println("Da cho an: " + m + "kg");
        System.out.println(getFood());
    }
    public void HaveBaby(String name){
       Scanner scan = new Scanner("Nhap ten con vat moi sinh: ");
       name = scan.nextLine();
       Animal a = new Animal(name);
    }
    public void ScanInfor(){
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", food=" + food +
                '}';
    }
}
