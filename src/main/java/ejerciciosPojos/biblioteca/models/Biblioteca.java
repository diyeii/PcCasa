package ejerciciosPojos.biblioteca.models;

import java.util.Arrays;
import java.util.Objects;

public class Biblioteca {
    private String name;
    private Book[] books;

    public Biblioteca(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(name, that.name) && Objects.deepEquals(books, that.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(books));
    }
}
