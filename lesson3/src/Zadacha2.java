import java.util.Arrays;

/**
 * Created by Andrey on 13.06.2016.
 */
public class Zadacha2 {
    public static void main (String[] args){
        int n = 5;
        int[] massiv = new int[n];
        int len = massiv.length;
        massiv[0] = 1;
        massiv[len-1] = 10;
        int o = massiv[0];
        massiv[0] = massiv[len-1];
        massiv[len-1] = o;
        String s = Arrays.toString(massiv);
        System.out.println(s);
    }
}
