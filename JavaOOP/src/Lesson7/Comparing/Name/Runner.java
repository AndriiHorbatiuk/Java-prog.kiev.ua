package Lesson7.Comparing.Name;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Andrey on 15.08.2016.
 */
public class Runner {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anton", "Scala", "Aaron", "Aaaaa", "Zzzzz", "Bravo", "Bbbbbbb", "Z-planet","VeryLongString","Bbbbb");
        Comparing comparing = new Comparing(list);
        comparing.sortAlphabet();
        comparing.sortReverseAlphabet();
        comparing.minName();
        comparing.stringLength();
        comparing.stringLengthWithParams();
    }
}
