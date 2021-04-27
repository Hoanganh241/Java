package lab10;

public class Tiger extends Animal{
    public Tiger(String name){
        super(name);
    }

    public void run(int speed){
        System.out.println("Tiger: " + super.getName() + "chay voi toc d do: " + speed + "km\\h");
    }

    @Override
    public void HaveBaby(String name) {
        super.HaveBaby(name);
    }

    @Override
    public String toString() {
        return "Name of your new tiger is:" + super.getName();
    }
}
