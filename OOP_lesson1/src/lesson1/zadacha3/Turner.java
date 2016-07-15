package lesson1.zadacha3;

import java.util.Arrays;

/**
 * Created by Andrey on 16.07.2016.
 */
public class Turner {
    private int[][] massiv = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    private int[][] turn270Degrees(int[][] x) {
        int[][] y = new int[x.length][x.length];
        for (int cols = 0; cols < x.length; cols++) {
            for (int rows = 0, count = (x[cols].length - 1); rows < x[cols].length; rows++, count--) {
                y[cols][rows] = x[count][cols];
            }
        }
        return y;
    }

    private int[][] turn180Degrees(int[][] x) {
        int[][] result = turn270Degrees(x);
        result = turn270Degrees(result);
        return result;
    }

    private int[][] turn90Degrees(int[][] x) {
        int[][] result = turn180Degrees(x);
        result = turn270Degrees(result);
        return result;
    }

    public void display90() {
        System.out.println(Arrays.toString(turn90Degrees(massiv)[0]));
        System.out.println(Arrays.toString(turn90Degrees(massiv)[1]));
        System.out.println(Arrays.toString(turn90Degrees(massiv)[2]));
    }
    public void display180() {
        System.out.println(Arrays.toString(turn180Degrees(massiv)[0]));
        System.out.println(Arrays.toString(turn180Degrees(massiv)[1]));
        System.out.println(Arrays.toString(turn180Degrees(massiv)[2]));
    }
    public void display270() {
        System.out.println(Arrays.toString(turn270Degrees(massiv)[0]));
        System.out.println(Arrays.toString(turn270Degrees(massiv)[1]));
        System.out.println(Arrays.toString(turn270Degrees(massiv)[2]));
    }
}

