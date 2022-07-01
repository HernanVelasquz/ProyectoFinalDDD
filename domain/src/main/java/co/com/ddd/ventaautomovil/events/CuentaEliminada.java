package co.com.ddd.ventaautomovil.events;

import co.com.ddd.cuenta.values.CuentaId;
import co.com.sofka.domain.generic.DomainEvent;

public class CuentaEliminada extends DomainEvent {
    private final CuentaId cuentaId;

    public CuentaEliminada(CuentaId cuentaId) {
        super("sofka.cuenta.CuentaEliminada");
        this.cuentaId = cuentaId;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }
}
