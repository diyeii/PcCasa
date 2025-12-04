package ejerciciosPojos.biblioteca.readers;

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



    }
}
