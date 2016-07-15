import java.util.Arrays;

/**
 * Created by Andrey on 04.07.2016.
 */
public class Final_Array {
    public static void main(String[] args) {
        int[] massiv = {1,2,3};
        System.out.println(Arrays.toString(getChangedArray(massiv)));
    }
    static int[] getChangedArray(int[] x){
        x[0] = 0;
        return x;
    }
}
