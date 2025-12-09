package ejerciciosPojos.aerolinea.models;

import java.util.Objects;

public class Pasajero {
    private String nif;
    private String name;
    private String surname;
    private String seat;

    public Pasajero(String nif, String name, String surname, String seat) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.seat = seat;
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

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pasajero pasajero = (Pasajero) o;
        return Objects.equals(nif, pasajero.nif) && Objects.equals(name, pasajero.name) && Objects.equals(surname, pasajero.surname) && Objects.equals(seat, pasajero.seat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, seat);
    }
}
