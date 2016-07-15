import java.util.Arrays;

/**
 * Created by Andrey on 08.07.2016.
 */
public class Class1 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            arr[0][i] = j;
            arr[i][0] = j;
        }
        for (int rows = 1; rows < arr.length; rows++) {
            for (int j = 1, index = 1; j < arr[rows].length; j++, index++) {
                arr[rows][j] = arr[0][j] * arr[rows][0];
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
