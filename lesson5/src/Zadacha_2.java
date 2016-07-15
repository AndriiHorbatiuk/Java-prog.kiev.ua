import java.util.Arrays;

/**
 * Created by Andrey on 22.06.2016.
 */
public class Zadacha_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(uvelich(arr));
        String s = Arrays.toString(arr);
        System.out.println(s);

    }
    static int uvelich(int[] y){
        int sum = 0;
        for(int i = 0; i < 3; i++){
            y[i] += 1;
            sum = sum + y[i];
        }
        return sum;
    }
}
