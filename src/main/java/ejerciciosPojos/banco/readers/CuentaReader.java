package ejerciciosPojos.banco.readers;

import ejerciciosPojos.banco.models.Cuenta;

import java.util.Scanner;

public class CuentaReader {
    private final Scanner scanner;

    public CuentaReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Cuenta read (){
        System.out.println("Escriba el IBAN de la cuenta: ");
        String iban = scanner.nextLine();

        System.out.println("Escriba el balance de la cuenta: ");
        double balance= scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Escriba el propietario de la cuenta: ");
        String customer = scanner.nextLine();

        return new Cuenta(iban, balance, customer);
    }
}
