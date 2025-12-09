package ejerciciosPojos.biblioteca.readers;

import ejerciciosPojos.biblioteca.models.Biblioteca;
import ejerciciosPojos.biblioteca.models.Book;

import java.util.Scanner;

public class BibliotecaReader {
    private final Scanner scanner;
    private final BookReader bookReader;

    public BibliotecaReader(Scanner scanner, BookReader bookReader) {
        this.scanner = scanner;
        this.bookReader = bookReader;
    }

    public Biblioteca read (){

        System.out.println("Escribe el nombre de la biblioteca: ");
        String name = scanner.nextLine();

        System.out.println("Escriba el número de libros de la biblioteca: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Book[] books = new Book[n];
        for (int i = 0; i < books.length; i++) {
            books[i]= bookReader.read();

        }
        return new Biblioteca(name, books);
    }
}
