package ejerciciosPojos.aerolinea.models;

import java.util.Objects;

public class Vuelo {
    private int flyNumber;
    private String origen;
    private String destination;
    private String embarqueDoor;
    private String passenger;

    public Vuelo(int flyNumber, String origen, String destination, String embarqueDoor, String passenger) {
        this.flyNumber = flyNumber;
        this.origen = origen;
        this.destination = destination;
        this.embarqueDoor = embarqueDoor;
        this.passenger = passenger;
    }

    public int getFlyNumber() {
        return flyNumber;
    }

    public void setFlyNumber(int flyNumber) {
        this.flyNumber = flyNumber;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getEmbarqueDoor() {
        return embarqueDoor;
    }

    public void setEmbarqueDoor(String embarqueDoor) {
        this.embarqueDoor = embarqueDoor;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return flyNumber == vuelo.flyNumber && Objects.equals(origen, vuelo.origen) && Objects.equals(destination, vuelo.destination) && Objects.equals(embarqueDoor, vuelo.embarqueDoor) && Objects.equals(passenger, vuelo.passenger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flyNumber, origen, destination, embarqueDoor, passenger);
    }
}
