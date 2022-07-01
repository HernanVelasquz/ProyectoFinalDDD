package co.com.ddd.ventaautomovil.events;

import co.com.ddd.ventaautomovil.values.FacturaId;
import co.com.sofka.domain.generic.DomainEvent;

public class FacturaCancelada extends DomainEvent {
    private final FacturaId facturaId;

    public FacturaCancelada(FacturaId facturaId) {
        super("sofka.cuenta.FacturaCancelada");
        this.facturaId = facturaId;
    }
}
