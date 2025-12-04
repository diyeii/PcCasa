package ejerciciosPojos.banco;

import java.util.Objects;

public class Cuenta {
    private String iban;
    private double balance;
    private String customer;

    public Cuenta(String iban, double balance, String customer) {
        this.iban = iban;
        this.balance = balance;
        this.customer = customer;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cuenta cuenta = (Cuenta) o;
        return Double.compare(balance, cuenta.balance) == 0 && Objects.equals(iban, cuenta.iban) && Objects.equals(customer, cuenta.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban, balance, customer);
    }
}
