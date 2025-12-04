package ejerciciosPojos.instituto.readers;

import ejerciciosPojos.instituto.models.Student;

import java.util.Scanner;

public class StudentReader {
    private final Scanner scanner;

    public StudentReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Student read(){
        System.out.println("Introduce los datos del estudiante: ");

        System.out.println("Nombre: ");
        String name = scanner.nextLine();
        System.out.println("Apellidos:");
        String surname = scanner.nextLine();
        System.out.println("Dirección: ");
        String address = scanner.nextLine();

        return new Student(name, surname, address);
    }
}
