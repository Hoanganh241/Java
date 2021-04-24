package session10;

public class Vehicle {
    protected String VehicleNo;
    protected String VehicleName;
    protected int wheels;

    /**
     * Accelerates the vehicle
     *
     * @return void
     */

    public void accelerate(int speed) {
        System.out.println("Accelerating at: " + speed + "kmph");
    }
}
