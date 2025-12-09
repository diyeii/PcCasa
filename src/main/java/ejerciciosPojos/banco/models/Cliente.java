package ejerciciosPojos.banco.models;

import java.util.Objects;

public class Cliente {
    private String nif;
    private String name;
    private String surname;

    public Cliente(String nif, String name, String surname) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nif, cliente.nif) && Objects.equals(name, cliente.name) && Objects.equals(surname, cliente.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname);
    }
}
