import java.util.Arrays;

public class Zadacha_4 {
    public static void main(String[] args) {
        String badText = "Я  длинное предложение Я второе     предложение.";
        StringBuilder sb = new StringBuilder();
        String[] words = badText.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                sb.append(words[i]);
                if (i + 1 < words.length &&
                        (words[i + 1].length() > 0) &&
                        Character.isUpperCase(words[i+1].charAt(0)) &&
                        (!words[i].endsWith("."))) {
                    sb.append(". ");
                } else {
                    sb.append(" ");
                }
            }
        }

        System.out.println(sb.toString());
    }
}
