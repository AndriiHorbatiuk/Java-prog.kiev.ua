import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Andrey on 12.07.2016.
 */
public class PWDGenerator {


    public static void main(String[] args) {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        for (int len = 8; len < 17; len++) {
            iterate(chars, len, new char[len], 0);
        }
    }

    public static void iterate(char[] chars, int len, char[] build, int pos) {

        if (pos == len) {
            String word = new String(build);
            // do what you need with each word here
            try {
                FileWriter writer = new FileWriter("pwd.txt", true);
                writer.write(word + "\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            build[pos] = chars[i];
            iterate(chars, len, build, pos + 1);
        }
    }
}

