package Lesson6;

/**
 * Created by Andrey on 10.08.2016.
 */
public enum Genre {
    HORROR("Horror"),
    COMEDY("Comedy"),
    THRILLER("Thriller"),
    RETRO("Retro");

    private final String genreName;

    Genre(String name) {
        genreName = name;
    }

    public String getGenreName() {
        return genreName;
    }
}
