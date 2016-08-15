package Lesson7.Comparing.Name;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Andrey on 15.08.2016.
 */
public class Runner {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anton", "Scala", "Bravo","Z-planet");
        Comparing comparing = new Comparing(list);
        comparing.sortAlpabet();

    }
}
