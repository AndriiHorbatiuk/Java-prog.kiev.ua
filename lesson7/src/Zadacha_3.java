import java.util.Arrays;

/**
 * Created by Andrey on 05.07.2016.
 */
public class Zadacha_3 {
    public static void main(String[] args) {
        int[] x1 = {1, 2, 3};
        int[] x2 = {9, 0, 3, 8, 12};
        int[] x3 = {1, 5, 8, 90};
        System.out.println(sumNumber(x1, x2, x3));
    }

    public static int sumNumber(int[] x1, int[] x2, int[] x3) {
        int length = x1.length + x2.length + x3.length;
        int[] massiv = new int[length];
        int sum = 0;
        System.arraycopy(x1, 0, massiv, 0, x1.length);
        System.arraycopy(x2, 0, massiv, x1.length, x2.length);
        System.arraycopy(x3, 0, massiv, (x1.length + x2.length), x3.length);
        System.out.println(Arrays.toString(massiv));

        for (int p : massiv) {
            sum += p;
        }
        return sum;
    }
}
