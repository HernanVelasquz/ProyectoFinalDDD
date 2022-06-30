package co.com.sofka.logicacliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroCelular implements ValueObject<String> {
    private final String value;

    public NumeroCelular(String value) {
        if (value.length() < 7){
            throw new IllegalArgumentException("El numero no cumple con el formato valido, el celular debe tener 8 digitos");
        }
        if(value.length() > 8){
            throw new IllegalArgumentException("El numero no cumple on el formato valido, el celular debe tener 8 digitos");
        }
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumeroCelular)) return false;
        NumeroCelular that = (NumeroCelular) o;
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
