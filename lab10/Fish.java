package lab10;

public class Fish extends Animal{
    public Fish(String name, int m){
        super(name);
    }

    public void swim(){
        System.out.println("Fish is: " + super.getName() + "swim so far!");
    }

    @Override
    public void HaveBaby(String name) {
        super.HaveBaby(name);
    }
    public void dive(){
        System.out.println("Fish is:" + super.getName() + "swim so far!");
    }

    @Override
    public String toString() {
        return "Name of the new fish is: " + super.getName();
    }
}
