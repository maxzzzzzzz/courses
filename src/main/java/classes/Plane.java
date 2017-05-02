package classes;

import com.sun.xml.internal.ws.developer.Serialization;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by ilost on 26.04.2017.
 */
public class Plane extends Mashine implements Serializable,Comparator<Plane> {
    private String nameOfPlane;
    private int speed;
    private int weightOfPlane;
    private  int countOfWheels;
    private int countOfPassangers;
    public Plane(){}

    public int getCountOfPassangers() {
        return countOfPassangers;
    }

    public Plane(String nameOfPlane, int speed, int weightOfPlane, int countOfWheels, int countOfPassangers) {
        this.nameOfPlane = nameOfPlane;
        this.speed = speed;
        this.weightOfPlane = weightOfPlane;
        this.countOfWheels = countOfWheels;
        this.countOfPassangers = countOfPassangers;
    }

    public void setCountOfPassangers(int countOfPassangers) {
        this.countOfPassangers = countOfPassangers;

    }

    public Plane(String nameOfPlane, int speed, int weightOfPlane, int countOfWheels) {
       this.nameOfPlane = nameOfPlane;
        this.speed = speed;
        this.weightOfPlane = weightOfPlane;
        this.countOfWheels = countOfWheels;
    }

    public String getNameOfPlane() {

        return nameOfPlane;
    }

    public void setNameOfPlane(String nameOfPlane) {
        this.nameOfPlane = nameOfPlane;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeightOfPlane() {
        return weightOfPlane;
    }

    public void setWeightOfPlane(int weightOfPlane) {
        this.weightOfPlane = weightOfPlane;
    }

    public void setCountOfWheels(int countOfWheels) {
        this.countOfWheels = countOfWheels;
    }


    public String getName(){
        return  nameOfPlane;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeightOfVehicle() {
        return weightOfPlane;
    }



    public int getNubmberOfPassangers() {
        return countOfPassangers;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    @Override
    public String toString() {
        return "Plane: " +
                "nameOfPlane is " + nameOfPlane+";"  +
                " speed is " + speed +";"+
                " weightOfPlane is " + weightOfPlane+";" +
                " countOfWheels is " + countOfWheels +";"+
                "countOfPassangers is "+ countOfPassangers
                +'\n';
    }

    public int compare(Plane obj1, Plane obj2) {
        String str1 = obj1.getName();
        String str2 = obj2.getName();

        return str1.compareTo(str2);
    }
//    public int compare1(Plane obj1, Plane obj2) {
//        double speed1 = obj1.getSpeed();
//        double speed2 = obj2.getSpeed();
//
//        if(speed1 > speed2) {
//            return 1;
//        }
//        else if(speed1 < speed2) {
//            return -1;
//        }
//        else {
//            return 0;
//        }
//    }


    public int compareTo(Object o) {
        return 0;
    }
}
