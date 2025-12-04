package ejerciciosPojos.biblioteca.readers;

import ejerciciosPojos.biblioteca.models.Autor;

import java.util.Scanner;

public class AutorReader {
    private final Scanner scanner;

    public AutorReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Autor read() {
        System.out.println("Escriba el nif del autor: ");
        String nif = scanner.nextLine();
        System.out.println("Escriba el nombre del autor: ");
        String name = scanner.nextLine();
        System.out.println("Escriba el apellido del autor: ");
        String surname = scanner.nextLine();

        return new Autor(nif, name, surname);
    }
}
