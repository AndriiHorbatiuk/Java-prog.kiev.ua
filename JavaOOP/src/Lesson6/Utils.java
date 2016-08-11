package Lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Andrey on 10.08.2016.
 */
public class Utils {

    public static List<Film> createListOfFilms() {
        List<Film> listOfFilms = new ArrayList<>();
        List<String> listOfActors = Arrays.asList("Actor1", "Actor2", "Actor3");

        listOfFilms.add(new Film()
                .setName("Film1")
                .setYear(1999)
                .setGenre(Genre.COMEDY)
                .setActors(listOfActors));

        listOfFilms.add(new Film()
                .setName("Film2")
                .setYear(1975)
                .setGenre(Genre.HORROR)
                .setActors(listOfActors));

        listOfFilms.add(new Film()
                .setName("Film3")
                .setYear(1997)
                .setGenre(Genre.THRILLER)
                .setActors(listOfActors));

        listOfFilms.add(new Film()
                .setName("Film4")
                .setYear(2000)
                .setGenre(Genre.RETRO)
                .setActors(listOfActors));

        listOfFilms.add(new Film()
                .setName("Film5")
                .setYear(2000)
                .setGenre(Genre.COMEDY)
                .setActors(listOfActors));


        return listOfFilms;
    }

    public static List<Film> findHorrorThrillerFilms(List<Film> filmList) {
        List<Film> resultList = new ArrayList<>();

        for (Film film : filmList) {
            if (film.getGenre() == Genre.HORROR | film.getGenre() == Genre.THRILLER) {
                resultList.add(film);
            }
        }
        return resultList;
    }

    public static List<Film> findComedyBetween19902000(List<Film> filmList) {
        List<Film> resultList = new ArrayList<>();

        for (Film film : filmList) {
            if (film.getGenre() == Genre.COMEDY && film.getYear() >= 1990 && film.getYear() <= 2000) {
                resultList.add(film);
            }
        }
        return resultList;
    }

    public static List<Film> findHorrorThrillerFilmsWithStream(List<Film> filmList) {
        Stream<Film> streamOfFilms = filmList.stream().filter((p) -> p.getGenre() == Genre.THRILLER || p.getGenre() == Genre.HORROR);
        return streamOfFilms.collect(Collectors.toList());
    }

    public static List<Film> findComedyBetween19902000WithStream(List<Film> filmList) {
        Stream<Film> streamOfFilms = filmList.stream().filter((p) -> p.getGenre() == Genre.COMEDY && (p.getYear() >= 1990 && p.getYear() <= 2000));
        return streamOfFilms.collect(Collectors.toList());
    }

}
