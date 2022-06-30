package co.com.sofka.logicacliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Operador implements ValueObject<String> {
    protected final String value;

    public Operador(String value) {
        if (value.length() <=2){
            throw new IllegalArgumentException("El operador ingresado no cumple con el formato valido");
        }
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Operador)) return false;
        Operador operador = (Operador) o;
        return Objects.equals(value, operador.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public String value() {
        return value;
    }
}
