package co.com.sofka.logicacliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicacliente.values.DocumentoId;
import co.com.sofka.logicacliente.values.NumeroDocumento;

public class NumeroDocumentoClienteActualizado extends DomainEvent {
    private final DocumentoId documentoId;
    private final NumeroDocumento numeroDocumento;

    public NumeroDocumentoClienteActualizado(DocumentoId documentoId, NumeroDocumento numeroDocumento) {
        super("sofka.logicacliente.numerodocumentoclienteactualizado");
        this.documentoId = documentoId;
        this.numeroDocumento = numeroDocumento;
    }

    public DocumentoId getDocumentoId() {
        return documentoId;
    }

    public NumeroDocumento getNumeroDocumento() {
        return numeroDocumento;
    }
}
