package co.com.ddd.ventaautomovil.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<Direccion.Props> {

    public interface Props {
        String calle();
        String nomenclatura();
    }
    private final String calle;
    private final String nomenclatura;

    public Direccion(String calle, String nomenclatura) {
        if (calle.length() < 3){
            throw new IllegalArgumentException("El formato de la calle no es valido");
        }
        if(nomenclatura.length()  > 15){
            throw new IllegalArgumentException("El formato de la nomenclatura no es valido");
        }
        this.calle = Objects.requireNonNull(calle);
        this.nomenclatura = Objects.requireNonNull(nomenclatura);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Direccion)) return false;
        Direccion direccion = (Direccion) o;
        return Objects.equals(calle, direccion.calle) && Objects.equals(nomenclatura, direccion.nomenclatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calle, nomenclatura);
    }
    @Override
    public Props value() {
        return new Props() {
            @Override
            public String calle() {
                return calle;
            }

            @Override
            public String nomenclatura() {
                return nomenclatura;
            }
        };
    }
}
