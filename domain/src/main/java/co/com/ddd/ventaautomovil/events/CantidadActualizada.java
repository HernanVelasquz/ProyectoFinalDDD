package co.com.ddd.ventaautomovil.events;

import co.com.ddd.ventaautomovil.values.Cantidad;
import co.com.ddd.ventaautomovil.values.FacturaId;
import co.com.sofka.domain.generic.DomainEvent;

public class CantidadActualizada extends DomainEvent {
    private final FacturaId facturaId;
    private final Cantidad cantidad;
    public CantidadActualizada(FacturaId facturaId, Cantidad cantidad) {
        super("sofka.ventaautomovil.CantidadModificada");
        this.facturaId = facturaId;
        this.cantidad = cantidad;
    }

    public FacturaId facturaId() {
        return facturaId;
    }

    public Cantidad cantidad() {
        return cantidad;
    }
}
