package co.com.sofka.logicacliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicacliente.values.ClienteId;
import co.com.sofka.logicacliente.values.DocumentoId;
import co.com.sofka.logicacliente.values.NumeroDocumento;

public class ActualizarNumeroDocumentoCliente extends Command {
    private final ClienteId clienteId;
    private final DocumentoId documentoId;
    private final NumeroDocumento numeroDocumento;

    public ActualizarNumeroDocumentoCliente(ClienteId clienteId, DocumentoId documentoId, NumeroDocumento numeroDocumento) {
        this.clienteId = clienteId;
        this.documentoId = documentoId;
        this.numeroDocumento = numeroDocumento;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public DocumentoId getDocumentoId() {
        return documentoId;
    }

    public NumeroDocumento getNumeroDocumento() {
        return numeroDocumento;
    }
}
