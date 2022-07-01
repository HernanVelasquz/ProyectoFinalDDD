package co.com.ddd.cuenta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Password implements ValueObject<String> {
    private final String value;

    public Password(String value) {
        if (value.length() < 5){
            throw new IllegalArgumentException("La contraseña del ingresada es muy corta");
        }
        if (value.length() > 25){
            throw new IllegalArgumentException("La contraseña sobre pasa el limte permitido");
        }
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Password)) return false;
        Password password = (Password) o;
        return Objects.equals(value, password.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value() {
        return value;
    }

    public Password cambiarPasswod(String value){
        return new Password(value);
    }
}
