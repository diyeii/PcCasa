package ejerciciosPojos.edificio.models;

import java.util.Objects;

public class Edificio {
    private String address;
    private String municipio;
    private String apartamentos;

    public Edificio(String address, String municipio, String apartamentos) {
        this.address = address;
        this.municipio = municipio;
        this.apartamentos = apartamentos;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(String apartamentos) {
        this.apartamentos = apartamentos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Edificio edificio = (Edificio) o;
        return Objects.equals(address, edificio.address) && Objects.equals(municipio, edificio.municipio) && Objects.equals(apartamentos, edificio.apartamentos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, municipio, apartamentos);
    }
}
