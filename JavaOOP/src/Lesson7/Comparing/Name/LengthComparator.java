package Lesson7.Comparing.Name;

import java.util.Comparator;

/**
 * Created by Andrey on 15.08.2016.
 */
public class LengthComparator implements Comparator<String>{
    public int compare(String string1, String string2) {
        return Integer.compare(string1.length(), string2.length());
    }
}
