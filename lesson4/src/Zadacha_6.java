import java.util.Arrays;
import java.util.Random;
/**
 * Created by Andrey on 16.06.2016.
 */
public class Zadacha_6 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] massiv = new int[10];
        int min = massiv[0];
        int max = massiv[0];
        for (int i = 0; i < 10; i++){
            massiv[i] = r.nextInt();
            if (min > massiv[i]){
                min = massiv[i];
            }
            if (max < massiv[i]){
                max = massiv[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
