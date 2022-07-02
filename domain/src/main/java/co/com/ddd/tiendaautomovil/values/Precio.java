package co.com.ddd.tiendaautomovil.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Float> {
    private final float value;

    public Precio(float value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Precio)) return false;
        Precio precio = (Precio) o;
        return Objects.equals(value, precio.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public Float value() {
        return value;
    }
}
