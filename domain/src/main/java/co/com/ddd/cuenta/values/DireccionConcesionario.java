package co.com.ddd.cuenta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DireccionConcesionario implements ValueObject<DireccionConcesionario.Props> {


    public interface Props {
        String tipoDocumento();
        String numeroDocumento();
    }
    private final String tipoDocumento;
    private final String numeroDocumento;

    public DireccionConcesionario(String tipoDocumento, String numeroDocumento) {
        if (tipoDocumento.length() < 1){
            throw new IllegalArgumentException("El tipo de documento no es valido");
        }
        if (numeroDocumento.length() < 5 || numeroDocumento.length() > 10){
            throw new IllegalArgumentException("El numero de documento no es valido");
        }
        this.tipoDocumento = Objects.requireNonNull(tipoDocumento);
        this.numeroDocumento = Objects.requireNonNull(numeroDocumento);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DireccionConcesionario)) return false;
        DireccionConcesionario that = (DireccionConcesionario) o;
        return Objects.equals(tipoDocumento, that.tipoDocumento) && Objects.equals(numeroDocumento, that.numeroDocumento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoDocumento, numeroDocumento);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String tipoDocumento() {
                return tipoDocumento;
            }

            @Override
            public String numeroDocumento() {
                return numeroDocumento;
            }
        };
    }

}
