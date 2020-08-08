package Project2;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        AllVehicle vehicle = new AllVehicle();
        vehicle.AddOn(new Parking("Car", "A", "Black", "1er23", 23));
        vehicle.AddOn(new Parking("Car", "B", "Black", "123tr3", 24));
        vehicle.AddOn(new Parking("Car", "C", "Black", "1y23", 20));
        vehicle.AddOn(new Parking("Car", "D", "Black", "123123", 2));
        vehicle.AddOn(new Parking("Car", "E", "Black", "123123", 5));
        vehicle.AddOn(new Parking("Car", "F", "Black", "123123", 6));
        vehicle.AddOn(new Parking("Car", "G", "Black", "123123", 9));
        vehicle.AddOn(new Parking("BUS", "H", "Black", "123123", 23));
        vehicle.AddOn(new Parking("BUS", "I", "Black", "123123", 24));
        vehicle.AddOn(new Parking("BUS", "K", "Black", "123123", 20));

        VehiclePosition position = new VehiclePosition();
        position.position(vehicle);
        Remove r = new Remove();
        r.remove(vehicle);
        r.remove(vehicle);
        r.getRemove();
        position.position(vehicle);

    }
}
