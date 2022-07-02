package co.com.ddd.cuenta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DireccionConcesionario implements ValueObject<DireccionConcesionario.Props> {

    public interface Props {
        String tipoDireccion();
        String numeroDocumento();
    }
    private final String tipoDireccion;
    private final String numeroDocumento;

    public DireccionConcesionario(String tipoDireccion, String numeroDocumento) {
        if (tipoDireccion.length() < 1){
            throw new IllegalArgumentException("El tipo de documento no es valido");
        }
        if (numeroDocumento.length() < 5 || numeroDocumento.length() > 10){
            throw new IllegalArgumentException("El numero de documento no es valido");
        }
        this.tipoDireccion = Objects.requireNonNull(tipoDireccion);
        this.numeroDocumento = Objects.requireNonNull(numeroDocumento);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DireccionConcesionario)) return false;
        DireccionConcesionario that = (DireccionConcesionario) o;
        return Objects.equals(tipoDireccion, that.tipoDireccion) && Objects.equals(numeroDocumento, that.numeroDocumento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoDireccion, numeroDocumento);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String tipoDireccion() {
                return tipoDireccion;
            }

            @Override
            public String numeroDocumento() {
                return numeroDocumento;
            }
        };
    }

}
