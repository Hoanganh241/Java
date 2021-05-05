package task13;

import java.util.ArrayList;
import java.util.List;

public class CreatArrayListExample {

    public static void main(String[] args) {


        List<String> animals = new ArrayList<>();


        animals.add("Lion");
        animals.add("Dog");
        animals.add("Cat");
        System.out.println(animals);

        animals.add(2, "Elephant");

        animals.add(3, "women");

        System.out.println(animals);
    }
}
