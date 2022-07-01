package co.com.ddd.ventaautomovil.events;

import co.com.ddd.ventaautomovil.values.Cantidad;
import co.com.ddd.ventaautomovil.values.FacturaId;
import co.com.ddd.ventaautomovil.values.Fecha;
import co.com.ddd.ventaautomovil.values.InformacionCompra;
import co.com.sofka.domain.generic.DomainEvent;

public class FacturaAgregada extends DomainEvent {
    private final FacturaId facturaId;
    private final Cantidad cantidad;
    private final InformacionCompra informacionCompra;
    private final Fecha fecha;

    public FacturaAgregada(FacturaId facturaId, Cantidad cantidad, InformacionCompra informacionCompra, Fecha fecha) {
        super("sofka.cuenta.FacturaAgregada");
        this.facturaId = facturaId;
        this.cantidad = cantidad;
        this.informacionCompra = informacionCompra;
        this.fecha = fecha;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }

    public InformacionCompra getInformacionCompra() {
        return informacionCompra;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
