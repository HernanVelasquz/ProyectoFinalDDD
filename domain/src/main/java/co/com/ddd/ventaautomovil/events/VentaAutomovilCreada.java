package co.com.ddd.ventaautomovil.events;

import co.com.ddd.cuenta.values.CuentaId;
import co.com.ddd.ventaautomovil.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class VentaAutomovilCreada extends DomainEvent {
    private final VentaAutomovilId ventaAutomovilId;
    private final CuentaId cuentaId;
    private final FacturaId facturaId;
    private final Cantidad cantidad;
    private final InformacionCompra informacionCompra;
    private final Fecha fecha;
    private final ClienteId clienteId;
    private final DocumentoCliente documentoCliente;
    private final Celular celular;
    private final Nombre nombre;
    private final Direccion direccion;

    public VentaAutomovilCreada(VentaAutomovilId ventaAutomovilId, CuentaId cuentaId,FacturaId facturaId, Cantidad cantidad, InformacionCompra informacionCompra, Fecha fecha, ClienteId clienteId, DocumentoCliente documentoCliente, Celular celular, Nombre nombre, Direccion direccion) {
        super("sofka.ventaautomovil.VentaAutomovilCreada");
        this.ventaAutomovilId = ventaAutomovilId;
        this.cuentaId = cuentaId;
        this.facturaId = facturaId;
        this.cantidad = cantidad;
        this.informacionCompra = informacionCompra;
        this.fecha = fecha;
        this.clienteId = clienteId;
        this.documentoCliente = documentoCliente;
        this.celular = celular;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public VentaAutomovilId ventaAutomovilId() {
        return ventaAutomovilId;
    }

    public CuentaId cuentaId() {
        return cuentaId;
    }

    public FacturaId facturaId() {
        return facturaId;
    }

    public Cantidad cantidad() {
        return cantidad;
    }

    public InformacionCompra informacionCompra() {
        return informacionCompra;
    }

    public Fecha fecha() {
        return fecha;
    }

    public ClienteId clienteId() {
        return clienteId;
    }

    public DocumentoCliente documentoCliente() {
        return documentoCliente;
    }

    public Celular celular() {
        return celular;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Direccion direccion() {
        return direccion;
    }
}
