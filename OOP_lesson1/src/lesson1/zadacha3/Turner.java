package lesson1.zadacha3;

import java.util.Arrays;

/**
 * Created by Andrey on 16.07.2016.
 */
public class Turner {
    static int[][] massiv = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(massiv[0]));
        System.out.println(Arrays.toString(massiv[1]));
        System.out.println(Arrays.toString(massiv[2]));
        System.out.println("");
        System.out.println(Arrays.toString(turn90Degrees(massiv)[0]));
        System.out.println(Arrays.toString(turn90Degrees(massiv)[1]));
        System.out.println(Arrays.toString(turn90Degrees(massiv)[2]));
    }

    public static int[][] turn90Degrees(int[][] x) {
        for (int cols = 0; cols < x.length; cols++) {
            for (int rows = 0, temp = (x[cols].length - 1); rows < x[cols].length; rows++, temp--) {
                x[cols][rows] = x[temp][cols];
//                System.out.println(Arrays.toString(x[cols]));
//                System.out.println("");
            }
        }
        return x;
    }
}
