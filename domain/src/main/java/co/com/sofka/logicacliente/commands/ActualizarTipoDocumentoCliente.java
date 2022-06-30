package co.com.sofka.logicacliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicacliente.DocumentoCliente;
import co.com.sofka.logicacliente.values.ClienteId;
import co.com.sofka.logicacliente.values.DocumentoId;
import co.com.sofka.logicacliente.values.TipoDocumento;

public class ActualizarTipoDocumentoCliente extends Command {
    private final ClienteId clienteId;
    private final DocumentoId documentoId;
    private final TipoDocumento tipoDocumento;

    public ActualizarTipoDocumentoCliente(ClienteId clienteId, DocumentoId documentoId, TipoDocumento tipoDocumento) {
        this.clienteId = clienteId;
        this.documentoId = documentoId;
        this.tipoDocumento = tipoDocumento;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public DocumentoId getDocumentoId() {
        return documentoId;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }
}
