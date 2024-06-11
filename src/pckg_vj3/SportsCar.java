package pckg_vj3;

import java.util.Date;

public class SportsCar extends Vehicle{
    public SportsCar(String brand, String model, String date) {
        super(brand,model);
        this.setDate(date);
    }

    @Override
    public void startVehicle() {
        System.out.println("SportsCar starting the engine!");
    }


}
