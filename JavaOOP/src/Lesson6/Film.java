package Lesson6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 10.08.2016.
 */
public class Film {
    private String name;
    private int year;
    private List<String> actors = new ArrayList<>();
    private Genre genre;

    public String getName() {
        return name;
    }

    public Film setName(String name) {
        this.name = name;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Film setYear(int year) {
        this.year = year;
        return this;
    }

    public List<String> getActors() {
        return actors;
    }

    public Film setActors(List<String> actors) {
        this.actors = actors;
        return this;
    }

    public Genre getGenre() {
        return genre;
    }

    public Film setGenre(Genre genre) {
        this.genre = genre;
        return this;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", actors=" + actors +
                ", genre=" + genre.getGenreName() +
                '}';
    }
}
