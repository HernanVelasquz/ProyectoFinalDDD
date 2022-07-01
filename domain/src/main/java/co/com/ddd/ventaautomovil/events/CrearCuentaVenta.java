package co.com.ddd.ventaautomovil.events;

import co.com.ddd.cuenta.values.CuentaId;
import co.com.sofka.domain.generic.DomainEvent;

public class CrearCuentaVenta extends DomainEvent {
    private final CuentaId cuentaId;

    public CrearCuentaVenta(CuentaId cuentaId) {
        super("sofka.cuenta.CuentaCreada");
        this.cuentaId = cuentaId;
    }

    public CuentaId getClienteId() {
        return cuentaId;
    }
}
