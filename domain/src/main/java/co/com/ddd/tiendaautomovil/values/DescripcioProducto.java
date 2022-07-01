package co.com.ddd.tiendaautomovil.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DescripcioProducto implements ValueObject<String> {
    private final String value;

    public DescripcioProducto(String value) {
        if (value.length() < 10){
            throw new IllegalArgumentException("La descripcion no es valida");
        }
        if (value.length() > 50) {
            throw new IllegalArgumentException("La drescripcion no es valida, sobre pasa el formato permitido");
        }

        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DescripcioProducto)) return false;
        DescripcioProducto that = (DescripcioProducto) o;
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
