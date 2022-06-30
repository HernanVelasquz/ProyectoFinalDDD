package co.com.sofka.logicacliente;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.logicacliente.values.DocumentoId;
import co.com.sofka.logicacliente.values.NumeroDocumento;
import co.com.sofka.logicacliente.values.TipoDocumento;

import java.util.Objects;

public class DocumentoCliente extends Entity<DocumentoId> {
    protected TipoDocumento tipoDocumento;
    protected NumeroDocumento numeroDocumento;

    public DocumentoCliente(DocumentoId entityId, TipoDocumento tipoDocumento,  NumeroDocumento numeroDocumento) {
        super(entityId);
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public void cambiarTipoDocumento(TipoDocumento tipoDocumento){
        this.tipoDocumento = Objects.requireNonNull(tipoDocumento);
    }

    public void cambiarNumeroDocumento(NumeroDocumento numeroDocumento) {
        this.numeroDocumento = Objects.requireNonNull(numeroDocumento);
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public NumeroDocumento getNumeroDocumento() {
        return numeroDocumento;
    }
}
