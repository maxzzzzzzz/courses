package classes;

import interfaces.Run;

/**
 * Created by ilost on 26.04.2017.
 */
public abstract class Mashine implements Run {
    public static final double MAX_SPEED = 1000;
    public static final double LOWEST_SPEED = 5;
    public static final int MIN_COUNT_OF_PASSANGERS = 1;
    public static final int MAX_COUNT_OF_PASSANGERS = 80;
    public String nameOfVehicle;
    public int speedAtm;



    public Mashine() {
        this.nameOfVehicle = nameOfVehicle;
        this.speedAtm = speedAtm;
    }
    public String getName(){
        return nameOfVehicle ;
    }

}
