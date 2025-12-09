package ejerciciosPojos.aerolinea.readers;

import ejerciciosPojos.aerolinea.models.Aerolinea;

import java.util.Scanner;

public class AerolineaReader {
    private final Scanner scanner;

    public AerolineaReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Aerolinea read(){
        System.out.println("Escriba el nombre de la aerolínea: ");
        String name = scanner.nextLine();

        System.out.println("Escribe el nombre del vuelo: ");
        String name1 = scanner.nextLine();

        return new Aerolinea(name,name1);
    }
}
