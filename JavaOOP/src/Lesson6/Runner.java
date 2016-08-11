package Lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Andrey on 10.08.2016.
 */
public class Runner {
    public static void main(String[] args) {
        System.out.println("Все фильмы с жарном Horror, Thriller: ");
        System.out.println(Utils.findHorrorThrillerFilms(Utils.createListOfFilms()));
        System.out.println("Все фильмы комедии, которые выпущеные в 1990-2000: ");
        System.out.println(Utils.findComedyBetween19902000(Utils.createListOfFilms()));
        System.out.println("Все фильмы с жарном Horror, Thriller (используя Stream API): ");
        System.out.println(Utils.findHorrorThrillerFilmsWithStream(Utils.createListOfFilms()));
        System.out.println("Все фильмы комедии, которые выпущеные в 1990-2000 (используя Stream API): ");
        System.out.println(Utils.findComedyBetween19902000WithStream(Utils.createListOfFilms()));
    }



}
