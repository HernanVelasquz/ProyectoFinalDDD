package co.com.sofka.logicacliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroDocumento implements ValueObject<String> {
    private final String value;

    public NumeroDocumento(String value) {
        if (value.length() < 5){
            throw new IllegalArgumentException("El numero ingresado es invalido, debe ser mayor de 5 digitos");
        }
        if(value.length() > 10){
            throw new IllegalArgumentException("El numero ingresdo es invalido, debe ser menor de 10 digitos");
        }
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumeroDocumento)) return false;
        NumeroDocumento that = (NumeroDocumento) o;
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
