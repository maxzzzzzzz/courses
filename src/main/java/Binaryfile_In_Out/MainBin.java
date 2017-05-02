package Binaryfile_In_Out;

import classes.Mashine;
import classes.SortedBySpeed;
import classes.Steels;
import java.math.BigInteger;
import java.io.UnsupportedEncodingException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ilost on 02.05.2017.
 */
public class MainBin {
    private static final String FILENAME = "C:\\2 курс\\2semestrJAVA\\exc1\\src\\main\\java\\Binaryfile_In_Out\\file.bin";

    public static void main(String[] args) throws IOException {
        ArrayList<Mashine> st = new ArrayList<Mashine>();
        Steels stee1 = new Steels("Shark", 1000, 500, 3, 1);
        Steels stee2 = new Steels("Perani", 999, 400, 4, 2);
        Steels stee3 = new Steels("Dolphi", 1800, 600, 5, 3);
        Steels stee4 = new Steels("Do", 800, 600, 5, 4);
        st.add(stee1);
        st.add(stee2);
        st.add(stee3);
        st.add(stee4);
        Collections.sort(st, new SortedBySpeed());
        try (FileWriter buf = new FileWriter(FILENAME)) {

            buf.write(st.toString());
            //String encoding = "UTF-8";
            //BigInteger bi = new BigInteger(1, st.toString().getBytes(encoding));
            //buf.write(bi.toString(2));
            //buf.write(String.valueOf(st.toString().getBytes("UTF-8")));
        } catch (IOException e) {
            System.out.println("error");
        }
        List<String> lines = Files.readAllLines(Paths.get(FILENAME), StandardCharsets.UTF_8);
        for(String line: lines){
            System.out.println(line);
        }

    }
}



