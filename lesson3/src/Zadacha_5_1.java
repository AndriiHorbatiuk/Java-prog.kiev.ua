import java.util.Arrays;

/**
 * Created by Andrey on 13.06.2016.
 */
public class Zadacha_5_1 {
    public static void main (String[] args){
        int[] massiv = {1,2,3,4};
        int[] massiv_naoborot = new int[massiv.length];
        massiv_naoborot[0] = massiv[massiv.length-1];
        massiv_naoborot[1] = massiv[massiv.length-2];
        massiv_naoborot[2] = massiv[massiv.length-3];
        massiv_naoborot[3] = massiv[massiv.length-4];
        String s = Arrays.toString(massiv_naoborot);
        System.out.print(s);
    }
}
