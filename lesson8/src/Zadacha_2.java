/**
 * Created by Andrey on 06.07.2016.
 */
public class Zadacha_2 {
    public static void main(String[] args) {
        String x = "((((frf()))(dfsdf))(()";
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '(') {
                count += 1;
            } else if (x.charAt(i) == ')') {
                count -= 1;
            }
        }
        System.out.println(count);
    }
}
