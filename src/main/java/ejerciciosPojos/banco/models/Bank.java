package ejerciciosPojos.banco.models;

import java.util.Objects;

public class Bank {
    private String nameBank;
    private String accounts;

    public Bank(String nameBank, String accounts) {
        this.nameBank = nameBank;
        this.accounts = accounts;
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public String getAccounts() {
        return accounts;
    }

    public void setAccounts(String accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(nameBank, bank.nameBank) && Objects.equals(accounts, bank.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBank, accounts);
    }
}
