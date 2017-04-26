/**
 * Created by ilost on 26.04.2017.
 */
import classes.Maize;
import classes.Plane;
import classes.Steels;
import classes.Mashine;
import interfaces.Run;
public class Main {
    public static void main(String[] args){
        //System.out.print("hello");
        Steels steel = new Steels("Shark", 1000,500,3);
        System.out.println(steel.toString());
        System.out.println("*************************");
        Maize mai = new Maize("AH-42", 500, 1000, 8,80);
        System.out.println(mai.toString());
    }
}
