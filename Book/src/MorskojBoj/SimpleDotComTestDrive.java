package MorskojBoj;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Andrey on 20.06.2016.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {

        SimpleDotCom dot = new SimpleDotCom();
        ArrayList<Integer> location = new ArrayList<Integer>();
        location.addAll(Arrays.asList(3,4,5));
        String testResult = "Не пройден";
        dot.setLocationCells(location);
        int userGuess = 3;
        String result = dot.checkYourself(userGuess);
        if (result.equals("Попал")) {
            testResult = "Пройден";
        }
        System.out.println(testResult);
    }
}
