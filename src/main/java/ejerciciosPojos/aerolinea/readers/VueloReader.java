package ejerciciosPojos.aerolinea.readers;

import ejerciciosPojos.aerolinea.models.Vuelo;

import java.util.Scanner;

public class VueloReader {
    private final Scanner scanner;

    public VueloReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Vuelo read(){
        System.out.println("Escribe el número del vuelo: " );
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escribe el origen del vuelo: ");
        String origen = scanner.nextLine();

        System.out.println("Escribe el destino del vuelo: ");
        String destino = scanner.nextLine();

        System.out.println("Escribe la puerta de embarque del vuelo: ");
        String embarqueDoor = scanner.nextLine();

        System.out.println("Escribe los pasajeros del vuelo: ");
        String passengers = scanner.nextLine();

        return new Vuelo(n, origen,destino,embarqueDoor,passengers);
    }
}
