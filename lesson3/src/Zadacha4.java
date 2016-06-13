import java.util.stream.IntStream;

/**
 * Created by Andrey on 13.06.2016.
 */
public class Zadacha4 {
    public static void main (String[] args){
        int[] massiv = {15,2,21,4,5,6,7,8,9,10};
        int len = massiv.length;
        //int sum_massiv = massiv[0] + massiv[1] + massiv[2] + massiv[3] + massiv[4] + massiv[5] + massiv[6] + massiv[7] + massiv[8] + massiv[9];
        int sum = IntStream.of(massiv).sum();
        int sr_arifm = sum / len;
        System.out.print("Среднее арифметическое: " + sr_arifm);
    }
}
