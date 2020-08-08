package Project2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class VehiclePosition extends Parking{
    private String newRegistration;
    private Car car;
    private Remove remove;

    public VehiclePosition(){
        super();
        this.car = new Car();
    }
    public void setCar(Car car){
        this.car = car;
    }

    public void position(AllVehicle p){
        ArrayList<Parking> park1 = p.Vehicle();
        for(int i = 0; i < park1.size(); i++){
            String registration = park1.get(i).getRegistration();
            if(Eliminate(registration)){
                park1.remove(i);
            }
        }
        car.position(park1);
    }
    public boolean Eliminate(String p){
        for(Iterator<String> e = registrationList.iterator(); e.hasNext();){
            if(p.equals(registrationList)){
                return false;
            }
        }
        return true;
    }


}
