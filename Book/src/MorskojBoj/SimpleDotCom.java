package MorskojBoj;

/**
 * Created by Andrey on 20.06.2016.
 */
public class SimpleDotCom {
    int[] locationCells;
    int hits = 0;
    String ishit = "Мимо";

    void setLocationCells(int[] s) {
        locationCells = s;
    }

    String checkYourself(String guess) {
        if (guess instanceof String) {
            int x = Integer.parseInt(guess);
            for (int y : locationCells) {
                if (x == y) {
                    hits++;
                    ishit = "Попал";
                    break;
                }
            }
        }
        if (hits == locationCells.length){
            ishit = "Потопил";
        }
        return ishit;
    }
}
