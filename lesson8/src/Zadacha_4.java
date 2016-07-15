/**
 * Created by Andrey on 06.07.2016.
 */
public class Zadacha_4 {
    public static void main(String[] args) {
        long digit = 354;
        int result = 0;
        while(digit > 0){
            result += (int)(digit % 10);
            digit /= 10;
        }
        System.out.println(result);
    }
}
