package ejerciciosPojos.instituto.readers;

import ejerciciosPojos.instituto.models.HighSchool;
import ejerciciosPojos.instituto.models.Student;

import java.util.Scanner;

public class HighSchoolReader {
    private final Scanner scanner;
    private final StudentReader studentReader;

    public HighSchoolReader(Scanner scanner) {
        this.scanner = scanner;
        this.studentReader = new StudentReader(scanner);
    }

    public HighSchool read() {
        System.out.println("Nombre del instituto:");
        String name = scanner.nextLine();
        System.out.println("Escriba el número de estudiantes: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < students.length; i++) {
            students[i] = studentReader.read();
        }
        return new HighSchool(name, students);
    }

}
