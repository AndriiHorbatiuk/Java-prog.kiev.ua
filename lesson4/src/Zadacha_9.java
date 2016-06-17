import java.util.Arrays;
import java.util.Random;

/**
 * Created by Andrey on 17.06.2016.
 */
public class Zadacha_9 {
    public static void main(String[] args) {
        int[] massiv = {1,2,5,8,3,4,7};
        Zadacha_9_Class array = new Zadacha_9_Class();
        String s = Arrays.toString(array.mirror(massiv));
        System.out.println(s);
    }
}
