package ejerciciosPojos.edificio;

import java.util.Objects;

public class Apartamento {
    private int floors;
    private String door;
    private String owner;

    public Apartamento(int floors, String door, String owner) {
        this.floors = floors;
        this.door = door;
        this.owner = owner;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Apartamento that = (Apartamento) o;
        return floors == that.floors && Objects.equals(door, that.door) && Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floors, door, owner);
    }
}
