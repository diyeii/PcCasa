package ejerciciosPojos.banco.readers;

import ejerciciosPojos.banco.models.Cliente;

import java.util.Scanner;

public class ClienteReader {
    private final Scanner scanner;

    public ClienteReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Cliente read (){
        System.out.println("Escriba el nif del cliente: ");
        String nif = scanner.nextLine();

        System.out.println("Escriba el nombre del cliente: ");
        String name = scanner.nextLine();

        System.out.println("Escriba el apellido del cliente: ");
        String surname = scanner.nextLine();

        return new Cliente(nif, name, surname);
    }
}
