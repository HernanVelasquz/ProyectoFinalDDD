package co.com.ddd.cuenta.events;

import co.com.ddd.cuenta.values.CuentaId;
import co.com.ddd.cuenta.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

public class PrecioActualizado extends DomainEvent {
    private final CuentaId cuentaId;
    private final Precio precio;

    public PrecioActualizado(CuentaId cuentaId, Precio precio) {
        super("sofka.cuenta.ActualizarPrecio");
        this.cuentaId = cuentaId;
        this.precio = precio;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
