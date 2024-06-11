package pckg_vj3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
    private String brand;
    private String model;
    private SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
    private int vehID;
    private static int autoInc = 300;

    public Vehicle(){

    }
    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.vehID = autoInc++;
    }

    public void setDate(String date) {
        this.date.applyPattern(date);
    }
    public void startVehicle(){
        System.out.println(getClass().getSimpleName()+" starting the engine!");
    }
    public void stopVehicle(){
        System.out.println(getClass().getSimpleName() + " stop the vehicle!");
        System.out.println(getClass().getSimpleName() + " turn off the engine!");

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", date=" + date.format(new Date()) +
                ", vehID=" + vehID +
                '}';
    }

    public void vehInfo(){
        System.out.printf("Vehicle [brand = %s, model = %s, vehid = %d]%n",brand,model,vehID);

    }
    private void additionalMethod(String var){}
}
