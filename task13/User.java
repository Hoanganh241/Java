package task13;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public class ArrayListUserDefinedObjectExample {
        public void main(String[] args) {
            List<User> users = new ArrayList<>();
            users.add(new User("Pham Thi hoai An", 18));
            users.add(new User("Pham Thi hoai An", 18));
            users.add(new User("Pham Thi hoai An", 18));

            users.forEach(user -> {
                System.out.println("Name : " + user.getName() + ",Age : " + user.getAge());
            });


        }
    }
}
