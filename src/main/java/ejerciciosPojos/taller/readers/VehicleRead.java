package ejerciciosPojos.taller.readers;

import ejerciciosPojos.taller.models.TypeVehicle;
import ejerciciosPojos.taller.models.Vehicule;

import java.util.Scanner;

public class VehicleRead {

    private final Scanner scanner;

    public VehicleRead(Scanner scanner) {
        this.scanner = scanner;
    }

    public Vehicule read() {
        System.out.println("Conteste las preguntas sobre el vehículo: ");

        TypeVehicle[] typeVehicles = TypeVehicle.values();
        int option;
        do {
            System.out.println("Que tipo de vehiculo es: ");
            for (int i = 0; i < typeVehicles.length; i++) {
                System.out.println((1 + i) + "." + typeVehicles[i]);
            }
            while (!scanner.hasNextInt()) {
                System.out.println("Debe introducir un número válido.");
                scanner.nextLine();
            }
            option = scanner.nextInt();
            scanner.nextLine();
        } while (!(option >= 1 && option <= typeVehicles.length));

        TypeVehicle typeVehicle = typeVehicles[option - 1];

        System.out.println("Velocidad máxima: ");
        String maxSpeed = scanner.nextLine();

        System.out.println("Color del vehículo: ");
        String color = scanner.nextLine();

        System.out.println("Matrícula del vehículo: ");
        String matricula = scanner.nextLine();

        return new Vehicule(typeVehicle, maxSpeed,color,matricula);

    }
}
