package textfile_In_Out;

import classes.Mashine;
import classes.SortedBySpeed;
import classes.Steels;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import  java.util.List;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

/**
 * Created by ilost on 02.05.2017.
 */
public class MainText {
    private static final String FILENAME = "C:\\2 курс\\2semestrJAVA\\exc1\\src\\main\\java\\textfile_In_Out\\file.txt";
    public static void main(String[] args) throws IOException {
        ArrayList<Mashine> st = new ArrayList<Mashine>();
        Steels stee1 = new Steels("Shark", 1000,500,3,1);
        Steels stee2 = new Steels("Perani", 999,400,4, 2);
        Steels stee3 = new Steels("Dolphi", 1800,600,5, 3);
        Steels stee4 = new Steels("Do", 800,600,5,4);
        st.add(stee1);
        st.add(stee2);
        st.add(stee3);
        st.add(stee4);
        Collections.sort(st, new SortedBySpeed());
        try (FileWriter fileWriter = new FileWriter(FILENAME)) {
            fileWriter.write(st.toString());
        } catch (IOException ex) {
            System.out.println("error");
        }
        List<String> lines = Files.readAllLines(Paths.get(FILENAME), StandardCharsets.UTF_8);
        for(String line: lines){
            System.out.println(line);
        }

    }
}
