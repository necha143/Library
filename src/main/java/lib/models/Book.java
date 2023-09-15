package lib.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Book {
    private int bookID;
    @NotEmpty(message = "Название не должно быть пустым")
    @Size(min = 2, max = 60, message = "Название книги должно быть между 2 и 30 символами")
    private String name;

    @NotEmpty(message = "Имя автора не должно быть пустым")
    @Size(min = 2, max = 50, message = "Имя автора должно быть между 2 и 50 символами")
    private String author;

    @Min(value = 0, message = "Год книги должен быть введен")
    private int year;

    public Book() {
    }

    public Book(int bookID, String name, String author, int year) {
        this.bookID = bookID;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
}
