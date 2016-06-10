package ClassTest;

/**
 * Created by Andrey on 10.06.2016.
 */
public class MovieTestDrive {
    public static void main(String[] args){
        Movie one = new Movie();
        one.title = "Фильм, часть первая";
        one.genre = "Триллер";
        one.rating = -4;
        Movie two = new Movie();
        two.title = "Фильм, часть вторая";
        two.genre = "Триллер";
        two.rating = 3;
        Movie three = new Movie();
        three.title = "Фильм, часть третья";
        three.genre = "Триллер";
        three.rating = 5;
        three.playIt();
    }
}
