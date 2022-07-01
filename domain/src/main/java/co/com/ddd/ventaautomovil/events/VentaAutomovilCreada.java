package co.com.ddd.ventaautomovil.events;

import co.com.ddd.cuenta.values.CuentaId;
import co.com.ddd.ventaautomovil.values.FacturaId;
import co.com.ddd.ventaautomovil.values.VentaAutomovilId;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.ddd.ventaautomovil.values.ClienteId;

public class VentaAutomovilCreada extends DomainEvent {
    private final VentaAutomovilId ventaAutomovilId;
    private final CuentaId cuentaId;
    private final FacturaId facturaId;
    private final ClienteId clienteId;

    public VentaAutomovilCreada(VentaAutomovilId ventaAutomovilId, CuentaId cuentaId, FacturaId facturaId, ClienteId clienteId) {
        super("sofka.cuenta.VentaAutomovilCreada");
        this.ventaAutomovilId = ventaAutomovilId;
        this.cuentaId = cuentaId;
        this.facturaId = facturaId;
        this.clienteId = clienteId;
    }

    public VentaAutomovilId getVentaAutomovilId() {
        return ventaAutomovilId;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
