package co.com.ddd.tiendaautomovil.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DocumentoEmpleado implements ValueObject<DocumentoEmpleado.Props> {

    public interface Props {
        String tipoDocumento();
        String numeroDocumento();
    }

    private final String tipoDocumento;
    private final String numeroDocumento;

    public DocumentoEmpleado(String tipoDocumento, String numeroDocumento) {
        if (tipoDocumento.length() < 1 || numeroDocumento.length() < 5) {
            throw new IllegalArgumentException("El formato invalido para el tipo de documento o el Numero documento");
        }
        if(tipoDocumento.length() > 2 || numeroDocumento.length() > 10){
            throw new IllegalArgumentException("El sobre pasa el formato para el tipo de Documento o el Numero de Documento");
        }
        this.tipoDocumento = Objects.requireNonNull(tipoDocumento);
        this.numeroDocumento = Objects.requireNonNull(numeroDocumento);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DocumentoEmpleado)) return false;
        DocumentoEmpleado that = (DocumentoEmpleado) o;
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
