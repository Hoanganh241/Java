package task10;

public class Leader extends Staff{
    public Leader(int id, int age, String name, double salary) {
        super(11, 20, "Hoang Anh", 2050);
    }
                public double superSalary(){
            return superSalary() + superSalary()*10/100;

    }
}
