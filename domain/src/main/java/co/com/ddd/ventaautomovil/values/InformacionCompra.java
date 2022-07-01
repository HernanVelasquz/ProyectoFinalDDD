package co.com.ddd.ventaautomovil.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class InformacionCompra implements ValueObject<InformacionCompra.Props> {

    public interface Props{
        String tipoVehiculo();
        String modelo();
        String marca();
    }
    private final String tipoVehiculo;
    private final String modelo;
    private final String marca;

    public InformacionCompra(String tipoVehiculo, String modelo, String marca) {
        if (tipoVehiculo.length() < 2){throw new IllegalArgumentException("El formato ingresado para el tipo vehiculo no es valido");}
        if(tipoVehiculo.length() > 10){throw new IllegalArgumentException("El formato ingresado para el tipo vehiculo");}
        if (modelo.length() < 2){throw new IllegalArgumentException("El formato del modelo no es valido");}
        if (modelo.length() > 4){throw new IllegalArgumentException("El fomato del modelo es invalido");}
        if (marca.length() > 3){throw new IllegalArgumentException("El formato de la marca no es valida");}

        this.tipoVehiculo = Objects.requireNonNull(tipoVehiculo);
        this.modelo = Objects.requireNonNull(modelo);
        this.marca = Objects.requireNonNull(marca);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InformacionCompra)) return false;
        InformacionCompra that = (InformacionCompra) o;
        return Objects.equals(tipoVehiculo, that.tipoVehiculo) && Objects.equals(modelo, that.modelo) && Objects.equals(marca, that.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoVehiculo, modelo, marca);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String tipoVehiculo() {
                return tipoVehiculo;
            }

            @Override
            public String modelo() {
                return modelo;
            }

            @Override
            public String marca() {
                return marca;
            }
        };
    }
}
