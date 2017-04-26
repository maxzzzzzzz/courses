package classes;

/**
 * Created by ilost on 26.04.2017.
 */
public class Plane extends Mashine {
    private String nameOfPlane;
    private int speed;
    private int weightOfPlane;
    private  int countOfWheels;
    private int countOfPassangers;

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
        return "Plane{" +
                "nameOfPlane is " + nameOfPlane + '\n' +
                " speed is " + speed +'\n'+
                " weightOfPlane is " + weightOfPlane +'\n'+
                " countOfWheels is " + countOfWheels +'\n'+
                "countOfPassangers is "+ countOfPassangers+
                '}';
    }
}
