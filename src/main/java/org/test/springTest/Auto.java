package org.test.springTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Auto {


        private String mark;
        private int maxSpeed;
        private int numOfWheels;
        private int milage;
        private Engine engine;

        public Auto()
        {

        }



    public String getMark() {return mark;}
        public int getMaxSpeed() {return maxSpeed;}
        public int getNumOfWheels() {return numOfWheels;}
        public int getMilage() {return milage;}

        public void setMark(String mark) {
            this.mark = mark;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public void setNumOfWheels(int numOfWheels) {
            this.numOfWheels = numOfWheels;
        }

        public void setMilage(int milage) {
            this.milage = milage;
        }

    public Engine getEngine() {
        return engine;
    }
@Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "mark='" + getMark() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                ", numOfWheels=" + getNumOfWheels() +
                ", milage=" + getMilage() +
                ", engine=" + engine +

                '}';
    }
}
