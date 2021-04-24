package task12;

abstract public class Monster {
    private String name;

    public Monster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String attack(){
        return "!@#$%^&$%^& I don't now how to attack!";
    }
    abstract public double getArea();
}
