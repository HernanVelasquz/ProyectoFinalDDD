package co.com.sofka.logicacliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Calle implements ValueObject<String> {
    private final String value;

    public Calle(String value) {
        if(value.length() < 5){
            throw new IllegalArgumentException("El nombre de la calle debe ser mayor a 5 Caracteres");
        }
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Calle)) return false;
        Calle calle = (Calle) o;
        return Objects.equals(value, calle.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public String value() {
        return value;
    }
}
