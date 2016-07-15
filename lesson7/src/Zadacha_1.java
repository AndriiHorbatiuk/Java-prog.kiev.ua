import java.util.Arrays;

/**
 * Created by Andrey on 05.07.2016.
 */
public class Zadacha_1 {
    public static void main(String[] args) {
        String words = "word1 word2 word3";
        String[] array = words.split(" ");
        words = array[0];
        array[0] = array[2];
        array[2] = words;
        System.out.println(Arrays.toString(array));
    }
}
