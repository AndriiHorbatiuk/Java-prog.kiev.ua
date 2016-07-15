package MorskojBoj;

import java.util.ArrayList;

/**
 * Created by Andrey on 20.06.2016.
 */
public class SimpleDotCom {
    ArrayList<Integer> locationCells;
    int hits = 0;
    String ishit = "Мимо";

    public void setLocationCells(ArrayList<Integer> s) {
        locationCells = s;
    }

    /**
     * public String checkYourself(String guess) {
     * if (guess instanceof String) {
     * int x = Integer.parseInt(guess);
     * for (int y : locationCells) {
     * if (x == y) {
     * hits++;
     * ishit = "Попал";
     * break;
     * }
     * }
     * }
     * if (hits == locationCells.length) {
     * ishit = "Потопил";
     * }
     * return ishit;
     * }
     **/
    public String checkYourself(int guess) {
        int index = locationCells.indexOf(guess);
        if (index >= 0) {
            locationCells.remove(index);
            hits++;
            ishit = "Попал";

            if (locationCells.isEmpty()) {
                ishit = "Потопил";
            }
        } else {
            ishit = "Мимо";
        }
        return ishit;
    }
}
