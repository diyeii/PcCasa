package ejerciciosPojos.biblioteca.readers;

import ejerciciosPojos.biblioteca.models.Autor;
import ejerciciosPojos.biblioteca.models.Book;

import java.util.Scanner;

public class BookReader {
    private final Scanner scanner;
    private final AutorReader autorReader;

    public BookReader(Scanner scanner, AutorReader autorReader) {
        this.scanner = scanner;
        this.autorReader = autorReader;
    }

    public Book read (){
        System.out.println("Escriba el ISBN del libro: ");
        long isbn = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Escribe el título del libro: ");
        String name = scanner.nextLine();

        System.out.println("Escriba el año del libro: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escriba los autores del libro: ");
        int autores = scanner.nextInt();
        scanner.nextLine();

        Autor[] autors = new Autor[autores];
        for (int i = 0; i < autors.length; i++) {
            autors[i] = autorReader.read();

        }
        return new Book(isbn, name,  n, autors);
    }
}
