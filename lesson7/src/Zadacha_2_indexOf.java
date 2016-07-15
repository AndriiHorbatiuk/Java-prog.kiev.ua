/**
 * Created by Andrey on 05.07.2016.
 */
public class Zadacha_2_indexOf {
    public static void main(String[] args) {
        String text = "Hi Andrii. We like to meet you. Would you, like to meet our boss today?";
        String word = " to ";
        System.out.println(countWord(text, word));
    }

    public static int countWord(String text, String word) {
        int count = 0, pos = 0;
        do {
            pos = text.indexOf(word, pos);
            if ( pos >= 0) {
                count++;
                pos += word.length();
            }
        }
        while (pos > 0) ;

        return count;
    }
}
