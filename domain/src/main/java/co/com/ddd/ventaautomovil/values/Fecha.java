package co.com.ddd.ventaautomovil.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class Fecha implements ValueObject<LocalDate> {
    private final LocalDate value;

    public Fecha(LocalDate value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fecha)) return false;
        Fecha fecha = (Fecha) o;
        return Objects.equals(value, fecha.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public LocalDate value() {
        return value;
    }
}
