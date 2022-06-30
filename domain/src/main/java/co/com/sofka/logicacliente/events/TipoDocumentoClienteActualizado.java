package co.com.sofka.logicacliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicacliente.values.DocumentoId;
import co.com.sofka.logicacliente.values.TipoDocumento;

public class TipoDocumentoClienteActualizado extends DomainEvent {
    private final DocumentoId documentoId;
    private final TipoDocumento tipoDocumento;

    public TipoDocumentoClienteActualizado(DocumentoId documentoId, TipoDocumento tipoDocumento) {
        super("sofka.logicacliente.tipodocumentoclienteactualizado");
        this.documentoId = documentoId;
        this.tipoDocumento = tipoDocumento;
    }

    public DocumentoId getDocumentoId() {
        return documentoId;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }
}
