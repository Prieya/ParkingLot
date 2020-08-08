package Project2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MotorBike {
    private String position;
    List<Parking> row1 = new ArrayList<>();
    List <Parking> row2 = new ArrayList<>();
    List <Parking> row3 = new ArrayList<>();
    List <Parking> row4 = new ArrayList<>();
    List<Parking> AllMotorBike = new ArrayList<>();

    public MotorBike(){
        position = "";
    }
    public void setPosition(String Position){
        position = Position;
    }

    public String getPosition(){
        return position;
    }

    public void position(ArrayList<Parking> p){
        int sum = 0;
        for(int i = 0; i < p.size(); i++) {
            if(p.get(i).getType().equalsIgnoreCase("MotorBike")) {
                sum++;
                if(sum == 201) full();

                int hour = p.get(i).getHour();
                if (hour <= 24 && hour > 18) {
                    row1.add(p.get(i));
                } else if (hour <= 18 && hour > 12) {
                    row2.add(p.get(i));
                } else if (hour <= 12 && hour > 6) {
                    row3.add(p.get(i));
                } else {
                    row4.add(p.get(i));
                }
            }
        }
        setAllCar();
    }

    public void setAllCar(){
        row1.sort(Comparator.comparing(Parking::getHour));
        row2.sort(Comparator.comparing(Parking::getHour));
        row3.sort(Comparator.comparing(Parking::getHour));
        row4.sort(Comparator.comparing(Parking::getHour));

        for(int i = 0; i < row4.size(); i++)
            AllMotorBike.add(row4.get(i));
        for(int i = 0; i < row3.size(); i++)
            AllMotorBike.add(row3.get(i));
        for(int i = 0; i < row2.size(); i++)
            AllMotorBike.add(row2.get(i));
        for(int i = 0; i < row1.size(); i++)
            AllMotorBike.add(row1.get(i));
    }
    public String full(){
        return "Level 2 is Full";
    }
    public List<Parking> gAllMotorBike(){
        return AllMotorBike;
    }
}
