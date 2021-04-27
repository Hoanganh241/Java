package lab10;


public class Bird extends Animal{

    public Bird(String name){
        super(name);
    }
    public void fly(){
        System.out.println("Bird: " + super.getName() + "fly so height");
    }

    @Override
    public void HaveBaby(String name) {
        super.HaveBaby(name);
    }

    @Override
    public String toString() {
        return "Name of your new bird is: " + super.getName();
    }
}
