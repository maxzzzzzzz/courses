package JsonFile;

import classes.Mashine;
import classes.SortedByName;
import classes.Steels;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ilost on 02.05.2017.
 */
public class MainJson {
    private static final String FILENAME = "C:\\2 курс\\2semestrJAVA\\exc1\\src\\main\\java\\JsonFile\\file.json";
    public static void main(String[] args){
        ArrayList<Mashine> st = new ArrayList<Mashine>();
        Steels stee1 = new Steels("Shark", 1000,500,3,1);
        Steels stee2 = new Steels("Perani", 999,400,4, 2);
        Steels stee3 = new Steels("Dolphi", 1800,600,5, 3);
        Steels stee4 = new Steels("Do", 800,600,5,4);
        st.add(stee1);
        st.add(stee2);
        st.add(stee3);
        st.add(stee4);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json =gson.toJson(st);
        Collections.sort(st, new SortedByName());
        try (FileWriter fileWriter = new FileWriter(FILENAME)) {
            fileWriter.write(json);
        } catch (IOException ex) {
            System.out.println("error");
        }
       try{
           BufferedReader bufferedReader = new BufferedReader(
                   new FileReader(FILENAME));
           ArrayList<Mashine> list = (ArrayList<Mashine>) gson.fromJson(json,new TypeToken<ArrayList<Mashine>>(){}.getType());
           System.out.println(list);
        }catch (FileNotFoundException e){
           System.out.println("Error");
       }

    }

}
