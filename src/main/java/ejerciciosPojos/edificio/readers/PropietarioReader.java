package ejerciciosPojos.edificio.readers;

import ejerciciosPojos.edificio.models.Propietario;

import java.util.Scanner;

public class PropietarioReader {
    private final Scanner scanner;

    public PropietarioReader(Scanner scanner) {
        this.scanner = scanner;
    }


    public Propietario read() {
        System.out.println("Escriba el nif del propietario: ");
        String nif = scanner.nextLine();

        System.out.println("Escriba el nombre del propietario: ");
        String name = scanner.nextLine();

        System.out.println("Escriba el apellido del propietario: ");
        String surname = scanner.nextLine();

        return new Propietario(nif, name, surname);
    }
}
