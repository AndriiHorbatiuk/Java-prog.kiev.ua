package Zadacha2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 19.07.2016.
 */
public class BookRunner {

    private static boolean add;

    public static void main(String[] args) {
        List<Book> books = createBooks();
        List<Book> withDefinedAuthor = BookUtils.definedAuthor(books,"Автор первой книги");
        System.out.println("Поиск по автору дал следующий результат: " + withDefinedAuthor);
        List<Book> withDefinedPublisher = BookUtils.definedPublisher(books,"Издательство второй книги");
        System.out.println("Поиск по издательству дал следующий результат: " + withDefinedPublisher);
        List<Book> publishedAfterDefinedYear = BookUtils.afterDefinedYear(books,1000);
        System.out.println("Поиск по книгам старше 2000 года дал следующий результат: " + publishedAfterDefinedYear);
    }

    private static List<Book> createBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book()
                .setId(123)
                .setName("Книга 1")
                .setAuthor("Автор первой книги")
                .setPages(245)
                .setPrice(12.56)
                .setPublisher("Издательство первой книги")
                .setTypeOfBinding("Жесткий")
                .setYearOfPublish(1999));

        books.add(new Book()
                .setId(124)
                .setName("Книга 2")
                .setAuthor("Автор второй книги")
                .setPages(299)
                .setPrice(14.96)
                .setPublisher("Издательство второй книги")
                .setTypeOfBinding("Мягкий")
                .setYearOfPublish(2004));

        books.add(new Book()
                .setId(125)
                .setName("Книга 3")
                .setAuthor("Автор первой книги")
                .setPages(499)
                .setPrice(21.96)
                .setPublisher("Издательство второй книги")
                .setTypeOfBinding("Мягкий")
                .setYearOfPublish(2009));

        return books;
    }
}
