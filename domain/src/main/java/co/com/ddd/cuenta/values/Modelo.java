package co.com.ddd.cuenta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Modelo implements ValueObject<String> {
    private final String value;

    public Modelo(String value) {
        if(value.length() < 3){
            throw new IllegalArgumentException("El modelo ingresado no es valido");
        }
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Modelo)) return false;
        Modelo modelo = (Modelo) o;
        return Objects.equals(value, modelo.value);
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
