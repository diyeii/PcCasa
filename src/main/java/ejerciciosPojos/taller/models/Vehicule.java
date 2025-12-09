package ejerciciosPojos.taller.models;

import java.util.Objects;

public class Vehicule {
    private TypeVehicle typeVehicle;
    private String maxSpeed;
    private String color;
    private String matricula;

    public Vehicule(TypeVehicle typeVehicle, String maxSpeed, String color, String matricula) {
        this.typeVehicle = typeVehicle;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.matricula = matricula;
    }

    public TypeVehicle getTypeVehicle() {
        return typeVehicle;
    }

    public void setTypeVehicle(TypeVehicle typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicule vehicule = (Vehicule) o;
        return typeVehicle == vehicule.typeVehicle && Objects.equals(maxSpeed, vehicule.maxSpeed) && Objects.equals(color, vehicule.color) && Objects.equals(matricula, vehicule.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeVehicle, maxSpeed, color, matricula);
    }
}
