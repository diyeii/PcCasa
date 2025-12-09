package ejerciciosPojos.taller.readers;

import ejerciciosPojos.taller.models.Garage;
import ejerciciosPojos.taller.models.Vehicule;

import java.util.Scanner;

public class GarageReader {
    private final Scanner scanner;
    private final VehicleRead vehicleRead;

    public GarageReader(Scanner scanner, VehicleRead vehicleRead) {
        this.scanner = scanner;
        this.vehicleRead = vehicleRead;
    }

    public Garage read (){
        System.out.println("Conteste las siguientes preguntas acerca del garage: ");

        System.out.println("Nombre del garage: ");
        String name = scanner.nextLine();

        System.out.println("Dirección del garage: ");
        String address = scanner.nextLine();

        System.out.println("Número de vehículos en el garage: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Vehicule[] vehicles = new Vehicule[n];
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i]=vehicleRead.read();

        }
        return new Garage(name, address, vehicles);
    }
}
