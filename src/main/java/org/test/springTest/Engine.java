package org.test.springTest;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String type_of_fuel;
    private int hoursePower;

    public String getType_of_fuel() {
        return type_of_fuel;
    }

    public void setType_of_fuel(String type_of_fuel) {
        this.type_of_fuel = type_of_fuel;
    }

    public int getHoursePower() {
        return hoursePower;
    }

    public void setHoursePower(int hoursePower) {
        this.hoursePower = hoursePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type_of_fuel='" + type_of_fuel + '\'' +
                ", hoursePower=" + hoursePower +
                '}';
    }
}
