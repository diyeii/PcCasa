package ejerciciosPojos.aerolinea.readers;

import ejerciciosPojos.aerolinea.models.Pasajero;

import java.util.Scanner;

public class PasajeroReader {
    private final Scanner scanner;

    public PasajeroReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Pasajero read (){
        System.out.println("Escribe el nif del pasajero: ");
        String nif =scanner.nextLine();

        System.out.println("Escribe el nombre del pasajero: ");
        String name =scanner.nextLine();

        System.out.println("Escribe el apellido del pasajero: ");
        String surname =scanner.nextLine();

        System.out.println("Escribe el asiento del pasajero: ");
        String seat =scanner.nextLine();

        return new Pasajero(nif, name,surname, seat);
    }
}
