package session10;

public class FourWheel extends Vehicle{
    private boolean powerSteer;


    public FourWheel (String vId, String vName, int numWheels, boolean pSteer) {
        VehicleNo = vId;
        VehicleName = vName;
        wheels = numWheels;

        powerSteer = pSteer;
    }

    public void showDetail() {
        System.out.println("Vehicle no: " + VehicleNo);
        System.out.println("Vehicle name: " + VehicleName);
        System.out.println("Number of Wheels: " + wheels);

        if(powerSteer == true)
            System.out.println("Power Steeting: Yes");
        else
            System.out.println("Power Steering: No");
    }

public static void main(String[] args){
    //Create an object of child class and specify the values
    FourWheel objFour = new FourWheel("gsgsr", "audi" , 4, true);
    objFour.showDetail();
    objFour.accelerate(200);

}
}
