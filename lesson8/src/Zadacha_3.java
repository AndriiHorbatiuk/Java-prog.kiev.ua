import java.util.Arrays;

/**
 * Created by Andrey on 06.07.2016.
 */
public class Zadacha_3 {
    public static void main(String[] args) {
        String[][] dict = {{"hello","привет"},{"bye","пока"}};
        String x = "hello my dear student. bye";
        String[] arrx = x.split(" ");
        for (int i = 0; i < arrx.length; i++) {
            for (int j = 0; j < dict.length ; j++) {
                if(arrx[i].equals(dict[j][0])){
                    arrx[i] = dict[j][1];
                }
            }
        }
//        System.out.println(Arrays.toString(arrx));
        String y = String.join(" ",arrx);
        System.out.println(y);
    }
}
