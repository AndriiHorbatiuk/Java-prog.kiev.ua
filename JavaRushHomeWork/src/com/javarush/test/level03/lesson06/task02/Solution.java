package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
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