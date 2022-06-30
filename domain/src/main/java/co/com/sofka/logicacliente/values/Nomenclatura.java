package co.com.sofka.logicacliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nomenclatura implements ValueObject<String> {
    private final String value;

    public Nomenclatura(String value) {
        if(value.length() < 5){
            throw new IllegalArgumentException("La nomenclatura no corresponde al formato valido");
        }
        if(value.length() > 12){
            throw new IllegalArgumentException("La nomenclatura sobre pasa el formato valido");
        }
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nomenclatura)) return false;
        Nomenclatura that = (Nomenclatura) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public String value() {
        return value;
    }
}
