package Zadacha2;

/**
 * Created by Andrey on 19.07.2016.
 */
public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int yearOfPublish;
    private int pages;
    private double price;
    private String typeOfBinding;

    public Book() {
    }

    public int getId() {
        return id;
    }

    public Book setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        validatorNull(name);
        this.name = name;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        validatorNull(author);
        this.author = author;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public Book setPublisher(String publisher) {
        validatorNull(publisher);
        this.publisher = publisher;
        return this;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public Book setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
        return this;
    }

    public int getPages() {
        return pages;
    }

    public Book setPages(int pages) {
        this.pages = pages;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Book setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public Book setTypeOfBinding(String typeOfBinding) {
        validatorNull(typeOfBinding);
        this.typeOfBinding = typeOfBinding;
        return this;
    }

    private boolean nullCheck(String s){
        boolean result = s != null;
        return result;
    }

    private void validatorNull(String s){
        if (!nullCheck(s)){
            throw new IllegalArgumentException("It can't be null");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", pages=" + pages +
                ", price=" + price +
                ", typeOfBinding='" + typeOfBinding + '\'' +
                '}';
    }
}
