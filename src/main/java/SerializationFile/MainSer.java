package SerializationFile;

import classes.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by ilost on 02.05.2017.
 */
public class MainSer  {
    private static  ArrayList<Mashine> st = new ArrayList<Mashine>();
    public static void main(String[] args){
       // st = (ArrayList<Mashine>) desDate("File") ;
        Steels stee1 = new Steels("Shark", 1000,500,3,1);
        Steels stee2 = new Steels("Perani", 999,400,4, 2);
        Steels stee3 = new Steels("Dolphi", 1800,600,5, 3);
        Steels stee4 = new Steels("Do", 800,600,5,4);
        st.add(stee1);
        st.add(stee2);
        st.add(stee3);
        st.add(stee4);

        //System.out.println(st.size());
        System.out.println("before sorting");
        for(Mashine s : st)
        {
            System.out.println(s.toString());
        }
        System.out.println("------------after sorting------------");
        Collections.sort(st,new SortedBySpeed());
        for(Mashine s: st){
            System.out.println(s.toString());
        }
        //serDate("File",st);
       // ArrayList<Maize> ma = new ArrayList<Maize>();


    }
    private static Object desDate(String file_name){
        Object retObject = null;
        try{
            FileInputStream fileIn = new FileInputStream(file_name+".ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            retObject = in.readObject();
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            System.exit(1);
        }catch(IOException e){
            System.out.println("Error");
            System.out.println(2);
        }catch(ClassNotFoundException e){
            System.out.println("Class not found");
            System.exit(3);
        }
        return retObject;
    }
    private static void serDate(String file_name,Object obj){
        try{
            FileOutputStream fileOut = new FileOutputStream(file_name+".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            fileOut.close();
            out.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            System.exit(1);//выйдет с программы
        }catch(IOException e){
            System.out.println("Error");
            System.out.println(2);
        }
    }
}
