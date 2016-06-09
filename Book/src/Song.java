/**
 * Created by Andrey on 10.06.2016.
 */
public class Song {
    public static void main (String[] args){
        int beernum = 99;
        String word = "бутылок";
        while (beernum > 0){
        if (beernum == 1){
            word = "бутылка";
        }
        System.out.println(beernum + " " + word + " на стене.");
        System.out.println(beernum + " " + word + " пива.");
            System.out.println("Возьми одну. Пусти по кругу.");
            beernum -= 1;
            if (beernum > 0){
                System.out.println(beernum + " " + word + " на стене.");
            } else{
                System.out.println("Нет бутылок пива на стене.");
            }
        }
    }
}
