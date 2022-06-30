package co.com.sofka.logicacliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoDocumento implements ValueObject<String> {
    private final String value;

    public TipoDocumento(String value) {
        if(value.length() < 2){
            throw new IllegalArgumentException("El tipo de documento no es valido");
        }
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TipoDocumento)) return false;
        TipoDocumento that = (TipoDocumento) o;
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
