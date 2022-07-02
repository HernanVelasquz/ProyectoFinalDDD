package co.com.ddd.ventaautomovil.events;

import co.com.ddd.ventaautomovil.values.FacturaId;
import co.com.ddd.ventaautomovil.values.InformacionCompra;
import co.com.sofka.domain.generic.DomainEvent;

public class InformacionCompraVehiculoActualizada extends DomainEvent {
    private final FacturaId facturaId;
    private final InformacionCompra informacionCompra;
    public InformacionCompraVehiculoActualizada(FacturaId facturaId, InformacionCompra informacionCompra) {
        super("sofka.ventaautomovil.InfomacionCompraEditada");
        this.facturaId = facturaId;
        this.informacionCompra = informacionCompra;
    }

    public FacturaId facturaId() {
        return facturaId;
    }

    public InformacionCompra informacionCompra() {
        return informacionCompra;
    }
}
