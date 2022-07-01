package co.com.ddd.ventaautomovil;

import co.com.ddd.ventaautomovil.values.*;
import co.com.sofka.domain.generic.Entity;

public class Cliente extends Entity<ClienteId> {
    protected DocumentoCliente documentoCliente;
    protected Celular celular;
    protected Nombre nombre;
    protected Direccion direccion;

    public Cliente(ClienteId entityId, DocumentoCliente documentoCliente, Celular celular, Nombre nombre, Direccion direccion) {
        super(entityId);
        this.documentoCliente = documentoCliente;
        this.celular = celular;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public DocumentoCliente getDocumentoCliente() {
        return documentoCliente;
    }

    public Celular getCelular() {
        return celular;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
