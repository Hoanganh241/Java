package lab10;

public class Rat extends Animal{

    private int Speed, weight;
    public Rat(String name, int Speed, int weight) {
        super(name);
        this.Speed = Speed;
        this.weight = weight;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void run() {
        System.out.println("Mèo không đuổi kịp chuột");
    }
}
