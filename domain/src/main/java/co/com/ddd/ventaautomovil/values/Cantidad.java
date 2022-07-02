package co.com.ddd.ventaautomovil.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cantidad implements ValueObject<Integer> {
    private final int value;

    public Cantidad(int value) {
        if(value < 0){
            throw new IllegalArgumentException("La cantidad de vehiculos no es valia");
        }
        this.value = Objects.requireNonNull(value);
    }

    public Integer value() {
        return value;
    }

    public Cantidad cambiarCantidad(int value){
        return new Cantidad(value);
    }
}
