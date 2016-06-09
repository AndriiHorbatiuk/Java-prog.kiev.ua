/**
 * Created by Andrey on 10.06.2016.
 */
public class GeneratorFraz {
    public static void main (String[] args){
        String[] wordlist1 = {"сложный","интересный","самостоятельный","допытливый","любознательный","прикольный","веселый"};
        String[] wordlist2 = {"мужчина","бульдозер","молот","гусь","Бэн"};
        String[] wordlist3 = {"талант","подход","искра","бомба","ветер","крюк"};
        //Вычисляем длинну массивов
        int wl1length = wordlist1.length;
        int wl2length = wordlist2.length;
        int wl3lenght = wordlist3.length;
        //Генерируем случаное число (позицию в массиве)
        int rand1 = (int)(Math.random()*wl1length);
        int rand2 = (int)(Math.random()*wl2length);
        int rand3 = (int)(Math.random()*wl3lenght);
        String phrase = wordlist1[rand1] + " " + wordlist2[rand2] + " " + wordlist3[rand3];
        System.out.print(phrase);
    }
}
