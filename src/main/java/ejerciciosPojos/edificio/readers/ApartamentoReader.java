package ejerciciosPojos.edificio.readers;

import ejerciciosPojos.edificio.models.Apartamento;

import java.util.Scanner;

public class ApartamentoReader {
    private final Scanner scanner;

    public ApartamentoReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Apartamento read (){
        System.out.println("Escribe el número de plantas: ");
        int divina = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escribe la puerta del apartamento: ");
        String door= scanner.nextLine();

        System.out.println("Propietario del apartamento: ");
        String owner = scanner.nextLine();

        return new Apartamento(divina, door, owner);
    }
}
