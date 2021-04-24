package task12;

 abstract public class demoabtract {
     private String color;

     public demoabtract(String color) {
         this.color = color;
     }

     @Override
     public String toString() {
         return "demoabtract{" +
                 "color='" + color + '\'' +
                 '}';
     }

     abstract public double getArea();
 }