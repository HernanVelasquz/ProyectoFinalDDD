package co.com.ddd.cuenta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreUsuario implements ValueObject<String> {
    private final String value;

    public NombreUsuario(String value) {
        if(value.length() < 3){
            throw new IllegalArgumentException("El nombre no cumple el formato valido");
        }
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NombreUsuario)) return false;
        NombreUsuario that = (NombreUsuario) o;
        return Objects.equals(value, that.value);
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

