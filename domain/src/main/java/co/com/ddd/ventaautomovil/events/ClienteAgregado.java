package co.com.ddd.ventaautomovil.events;

import co.com.ddd.ventaautomovil.values.*;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.ventaautomovil.values.*;

public class ClienteAgregado extends DomainEvent {
    private final ClienteId clienteId;
    private final DocumentoCliente documentoCliente;
    private final Celular celular;
    private final Direccion direccion;
    private final Nombre nombre;

    public ClienteAgregado(ClienteId clienteId, DocumentoCliente documentoCliente, Celular celular, Direccion direccion, Nombre nombre) {
        super("sofka.cuenta.ClienteAgregado");
        this.clienteId = clienteId;
        this.documentoCliente = documentoCliente;
        this.celular = celular;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public DocumentoCliente getDocumentoCliente() {
        return documentoCliente;
    }

    public Celular getCelular() {
        return celular;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
