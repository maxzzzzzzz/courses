package classes;

import java.util.Comparator;

/**
 * Created by ilost on 02.05.2017.
 */
public class SortedByName implements Comparator<Mashine> {


    public int compare(Mashine obj1, Mashine obj2) {
        String str1 = obj1.getName();
        String str2 = obj2.getName();

        return str1.compareTo(str2);
    }
}
