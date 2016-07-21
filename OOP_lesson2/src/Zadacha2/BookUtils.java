package Zadacha2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Andrey on 20.07.2016.
 */
public class BookUtils {
    public static List<Book> definedAuthor(List<Book> books, String author) {
        isNull(books);
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (Objects.equals(book.getAuthor(), author)) {
                result.add(book);
            }
        }
        return result;
    }

    public static List<Book> definedPublisher(List<Book> books, String publisher) {
        isNull(books);
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (Objects.equals(book.getPublisher(), publisher)) {
                result.add(book);


            }
        }
        return result;
    }

    public static List<Book> afterDefinedYear(List<Book> books, int year) {
        isNull(books);
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYearOfPublish() > year) {
                result.add(book);
            }
        }
        return result;
    }

    private static boolean objectNotNullValidator(List<Book> book){
        boolean result = Objects.equals(book,null);
        return result;
    }

    private static void isNull(List<Book> book){
        if(objectNotNullValidator(book)){
            throw new IllegalArgumentException("Create object Book first!");
        }
    }
}