package ejerciciosPojos.aerolinea.models;

import java.util.Objects;

public class Aerolinea {
    private String name;
    private String flights;

    public Aerolinea(String name, String flights) {
        this.name = name;
        this.flights = flights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlights() {
        return flights;
    }

    public void setFlights(String flights) {
        this.flights = flights;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aerolinea aerolinea = (Aerolinea) o;
        return Objects.equals(name, aerolinea.name) && Objects.equals(flights, aerolinea.flights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, flights);
    }
}
