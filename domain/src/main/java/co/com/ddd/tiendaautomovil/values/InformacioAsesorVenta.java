package co.com.ddd.tiendaautomovil.values;

import co.com.sofka.domain.generic.ValueObject;

public class InformacioAsesorVenta implements ValueObject<InformacioAsesorVenta.Props> {

    private final String nombreAsesor;
    private final String tipoDocumeto;
    private final String numeroDocumento;

    public InformacioAsesorVenta(String nombreAsesor, String tipoDocumeto, String numeroDocumento) {
        if(nombreAsesor.length() < 2){
            throw new IllegalArgumentException("El nombre no cumple con el formato valido");
        }
        if(tipoDocumeto.length() < 1 || tipoDocumeto.length() > 2){
            throw new IllegalArgumentException("El tipo de documento no es valido");
        }
        if (numeroDocumento.length() < 5) {
            throw new IllegalArgumentException("El documento es demasiado corto");
        }
        if(tipoDocumeto.length() > 10){
            throw new IllegalArgumentException("El documento sobre pasa el formato valido");
        }
        this.nombreAsesor = nombreAsesor;
        this.tipoDocumeto = tipoDocumeto;
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String nombreAsesor() {
                return nombreAsesor;
            }

            @Override
            public String tipoDocumeto() {
                return tipoDocumeto;
            }

            @Override
            public String numeroDocumento() {
                return numeroDocumento;
            }
        };
    }

    public interface Props {
        String nombreAsesor();
        String tipoDocumeto();
        String numeroDocumento();
    }

    public InformacioAsesorVenta cambiarNombreAsesor(String nombreAsesor){
        return new InformacioAsesorVenta(nombreAsesor, this.tipoDocumeto, this.numeroDocumento);
    }
    public InformacioAsesorVenta cambiarTipoDocumentoAsesor(String tipoDocumeto){
        return new InformacioAsesorVenta(this.nombreAsesor, tipoDocumeto, this.numeroDocumento);
    }
    public InformacioAsesorVenta cambiarNumeroDocumentoAsesor(String numeroDocumento){
        return new InformacioAsesorVenta(this.nombreAsesor, this.tipoDocumeto, numeroDocumento);
    }
}
