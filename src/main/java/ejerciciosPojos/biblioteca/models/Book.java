package ejerciciosPojos.biblioteca.models;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private long isbn;
    private String title;
    private int year;
    private Autor[] Autors;

    public Book(long isbn, String title, int year, Autor[] autors) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        Autors = autors;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Autor[] getAutors() {
        return Autors;
    }

    public void setAutors(Autor[] autors) {
        Autors = autors;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn && year == book.year && Objects.equals(title, book.title) && Objects.deepEquals(Autors, book.Autors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, year, Arrays.hashCode(Autors));
    }
}
