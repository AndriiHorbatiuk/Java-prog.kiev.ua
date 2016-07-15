import java.util.Arrays;

/**
 * Created by Andrey on 05.07.2016.
 */
public class Zadacha_2 {
    public static void main(String[] args) {
        String text = "Hi Andrii. We like to meet you. Would you, like to meet our boss today?";
        String word = "to";
        System.out.println(countWord(text,word));
    }
    public static int countWord(String text, String word){
        String[] array = text.split(" ");
        System.out.println(Arrays.toString(array));
        int count = 0;
        for(String p:array){
            if (p.equals(word)){
                count++;
            }
        }
        return count;
    }
}
