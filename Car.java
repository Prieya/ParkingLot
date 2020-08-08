package Project2;
import com.sun.jdi.IntegerValue;

import java.util.*;
import java.util.ArrayList;
import java.util.stream.*;
public class Car extends Remove{
    private String position;

    List <Parking> row1 = new ArrayList<>();
    List <Parking> row2 = new ArrayList<>();
    List <Parking> row3 = new ArrayList<>();
    List <Parking> row4 = new ArrayList<>();
    List<Parking> Allcar = new ArrayList<>();
    public Car(){
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
            if(p.get(i).getType().equalsIgnoreCase("car")) {
                sum++;
                if(sum == 101) full();

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
            Allcar.add(row4.get(i));
        for(int i = 0; i < row3.size(); i++)
            Allcar.add(row3.get(i));
        for(int i = 0; i < row2.size(); i++)
            Allcar.add(row2.get(i));
        for(int i = 0; i < row1.size(); i++)
            Allcar.add(row1.get(i));

        for(int i = 0; i < Allcar.size(); i++){
            for(int j = 0; j < delete.size(); j++){
                System.out.println("delete  " + delete.get(j));
                if(Allcar.get(i).getRegistration().equals(delete.get(j))) {
                    Allcar.remove(i);
                }
            }
        }

        ToString();
    }
    public String full(){
        return "Level 3 is Full";
    }

    public List<Parking> getAllcar(){
        return Allcar;
    }

    public void ToString(){
        Stream <Parking> stream = Allcar.stream();
        List<Integer> hours = new ArrayList<>();
        for(int i = 0; i < Allcar.size(); i++) {
             hours.add(Allcar.get(i).getHour());
        }
        List<Double> hour1 = hours
                .stream()
                .map(x -> x*7.50)
                .collect(Collectors.toList());

        for(int i = 0; i < Allcar.size(); i++){
            System.out.println("Type " + Allcar.get(i).getType() +
                    " Name " + Allcar.get(i).getName() + " Color " + Allcar.get(i).getColor() +
                    " Registration Number " + Allcar.get(i).getRegistration() + " Hour " + Allcar.get(i).getHour() +
                    " Price " + hour1.get(i));
        }
    }

}
