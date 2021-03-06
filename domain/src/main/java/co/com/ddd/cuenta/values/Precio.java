package co.com.ddd.cuenta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.security.PublicKey;
import java.util.Objects;

public class Precio implements ValueObject<Float> {
    private final float value;

    public Precio(float value) {
        if (value().isNaN()){
            throw new IllegalArgumentException("El precio no es valido");
        }
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Precio)) return false;
        Precio precio = (Precio) o;
        return Float.compare(precio.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public Float value() {
        return value;
    }

    public Precio cambiarPrecio(float value){
        return new Precio(value);
    }
}
