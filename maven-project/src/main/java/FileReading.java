import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Andrey on 06.07.2016.
 */
public class FileReading {
    static Scanner scn;
    static StringBuilder sb = new StringBuilder();
    static String result;

    public static void main(String[] args) {
        String path = "res//1.txt";
        readFile(path);
        writeString();
        displayString();
    }

    private static void readFile(String path) {
        try {
            scn = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    private static void writeString() {
        while (scn.hasNext()) {
            sb.append(scn.nextLine());
        }
        result = sb.toString();
    }

    private static void displayString() {
        System.out.println(result);
    }
}
