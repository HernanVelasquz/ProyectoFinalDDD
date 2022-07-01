package co.com.ddd.ventaautomovil.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {
    private final String value;

    public Nombre(String nombre) {
        if (nombre.length() > 2){
            throw new IllegalArgumentException("El nombre no cumple con el formato");
        }
        this.value = Objects.requireNonNull(nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nombre)) return false;
        Nombre nombre1 = (Nombre) o;
        return Objects.equals(value, nombre1.value);
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
