import java.util.Arrays;

/**
 * Created by Andrey on 16.06.2016.
 */
public class Zadacha_3 {
    public static void main(String[] args) {
        int[] massiv = new int[101];
        for (int i = 0, j = 100; i <= 100; i++,j--){
            massiv[i] = j;
        }
        String s = Arrays.toString(massiv);
        System.out.println(s);
    }
}
