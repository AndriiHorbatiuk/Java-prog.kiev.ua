import java.util.Arrays;

/**
 * Created by Andrey on 22.06.2016.
 */
public class Zadacha_4 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        String s = Arrays.toString(plus(arr1,arr2));
        System.out.println(s);

    }
    static int[] plus(int[]x, int[]y){
        int length = x.length + y.length;
        int [] massiv = new int[length];
        System.arraycopy(x,0,massiv,0,x.length);
        System.arraycopy(y,0,massiv,x.length,y.length);
        return massiv;

    }
}
