package ejerciciosPojos.banco.readers;

import ejerciciosPojos.banco.models.Bank;

import java.util.Scanner;

public class BankReader {
    private final Scanner scanner;

    public BankReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Bank read (){
        System.out.println("Nombre del banco: ");
        String name = scanner.nextLine();

        System.out.println("Numero de cuentas del banco: ");
        String accounts = scanner.nextLine();

        return new Bank(name, accounts);
    }
}
