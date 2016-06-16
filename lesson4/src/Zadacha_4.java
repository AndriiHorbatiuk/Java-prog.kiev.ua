import java.util.Arrays;
import java.util.Random;

/**
 * Created by Andrey on 16.06.2016.
 */
public class Zadacha_4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] massiv = new int[10];
        long sum = 0;
        for (int i = 0; i < 10; i++){
            massiv[i] = r.nextInt();
            if(i != 0 && i != ((massiv.length)-1)){
                sum += (long)(massiv[i]);
            }
        }
        String s = Arrays.toString(massiv);
        System.out.println(s);
        System.out.println(sum);
        long sum2 = (long)massiv[1] + massiv[2] + massiv[3] + massiv[4] + massiv[5] + massiv[6] + massiv[7] + massiv[8];
        System.out.println(sum2);
    }
}
