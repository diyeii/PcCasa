package ejerciciosPojos.taller.models;

import java.util.Arrays;
import java.util.Objects;

public class Garage {
    private String name;
    private String address;
    private Vehicule[] vehicules;

    public Garage(String name, String address, Vehicule[] vehicules) {
        this.name = name;
        this.address = address;
        this.vehicules = vehicules;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Vehicule[] getVehicules() {
        return vehicules;
    }

    public void setVehicules(Vehicule[] vehicules) {
        this.vehicules = vehicules;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return Objects.equals(name, garage.name) && Objects.equals(address, garage.address) && Objects.deepEquals(vehicules, garage.vehicules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, Arrays.hashCode(vehicules));
    }
}
