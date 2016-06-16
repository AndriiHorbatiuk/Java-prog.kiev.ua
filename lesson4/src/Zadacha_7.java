import java.util.Arrays;

/**
 * Created by Andrey on 16.06.2016.
 */
public class Zadacha_7 {
    public static void main(String[] args) {
        int[] massiv = {1,2,3,4,5,7,8,1,10,9,1,8,10,10,11,10,14,18};
        int[] massiv2 = massiv;
        int[] massivCount = new int[massiv.length];
        for(int i = 0; i < massiv.length; i++){
            for(int i2:massiv2){
                if(massiv[i] == i2){
                    massivCount[i] += 1;
                }
            }
        }
        int max = massivCount[0];
        int position = 0;
        for (int x = 0; x < massivCount.length;x++){
            if(max < massivCount[x]){
                max = massivCount[x];
                position = x;
            }
        }
        System.out.println(massiv[position]);
    }
}
