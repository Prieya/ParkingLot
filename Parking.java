package Project2;
import java.util.ArrayList;
import java.util.List;
public class Parking {
    private String type;
    private String name;
    private String color;
    private String registration;
    public List<String> registrationList= new ArrayList<>();
    private int hour;

    public Parking(){
        name = "";
        color = "";
        registration = "";
    }
    public Parking(Parking p){
        this.type = p.type;
        this.name = p.name;
        this.color = p.color;
        this.registration = p.registration;
        this.hour = p.hour;
    }

    public Parking(String type, String name, String color, String registration, int hour){
        this.name = name;
        this.color = color;
        this.registration = registration;
        this.hour = hour;
        this.type = type;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setRegistration(String registration) {

        registrationList.add(registration);
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getRegistration() {
        return registration;
    }
    public List<String> getRegistrationList() {
        return registrationList;
    }

    public  int getHour() {
        return hour;
    }

}
