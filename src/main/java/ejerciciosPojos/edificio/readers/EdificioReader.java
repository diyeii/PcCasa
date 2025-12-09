package ejerciciosPojos.edificio.readers;

import ejerciciosPojos.edificio.models.Edificio;

import java.util.Scanner;

public class EdificioReader {
    private final Scanner scanner;

    public EdificioReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Edificio read(){
        System.out.println("Dirección del edificio: ");
        String address= scanner.nextLine();

        System.out.println("Escribe el municipio en el que se encuentra el edificio: ");
        String direction=scanner.nextLine();

        System.out.println("Escribe los apartamentos que hay en el edificio: ");
        String apartamentos = scanner.nextLine();

        return new Edificio(address,direction,apartamentos);
    }
}
