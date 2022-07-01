package co.com.ddd.tiendaautomovil.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {
    private final String value;

    public Nombre(String value) {
        if(value.length()<5){
            throw new IllegalArgumentException("El nombre del cliente no puede ser menor a 5 caracteres");
        }
        if(value.length()>50){
            throw new IllegalArgumentException("El nombre del cliente no puede ser mayor a 50 caracteres");
        }
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nombre)) return false;
        Nombre nombre = (Nombre) o;
        return Objects.equals(value, nombre.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value() {
        return value;
    }
}
