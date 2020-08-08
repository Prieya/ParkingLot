package Project2;


import java.util.ArrayList;

public class AllVehicle extends Parking{
    private Car car;
    public ArrayList<Parking> park = new ArrayList<Parking>();
    public Remove r;

    public AllVehicle(String a, String name, String color, String registration, int hour){
        super(a, name, color, registration, hour);
        car = new Car();
    }

    public AllVehicle(){
        car = new Car();
    }
    public void AddOn(Parking p){
            park.add(p);
    }

    public ArrayList<Parking> Vehicle(){
        return park;
    }

}
