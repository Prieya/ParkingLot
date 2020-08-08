package Project2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Remove{
    public List<String> delete = new ArrayList<>();


    public List<String> getRemove(){
        for(int i = 0; i < delete.size(); i++)
        System.out.println(delete.get(i));
        return delete;
    }
    public void remove(AllVehicle p){
        ArrayList<Parking> park1 = p.Vehicle();
        park1.sort(Comparator.comparing(Parking::getHour));
        Parking park = park1.get(0);
        delete.add(park.getRegistration());
        park1.remove(park);
        System.out.println("Remove" + park.getName());




    }

}
