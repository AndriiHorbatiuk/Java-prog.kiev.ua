/**
 * Created by Andrey on 06.07.2016.
 */

import java.lang.Math;

public class Zadacha_6 {
    public static void main(String[] args) {
        int x = 20;
        StringBuilder result = new StringBuilder();
        result.append(123);
        for (int i = 4; i < x; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                boolean simple = true;
                for (int j = 3; j < i; j++) {
                    if (i % j == 0) {
                        simple = false;
                        break;
                    }
                }
                if (simple) {
                    result.append('\n').append(i);

                }

            }
        }
        System.out.println(result.toString());
    }
}
