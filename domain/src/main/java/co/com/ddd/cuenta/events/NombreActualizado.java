package co.com.ddd.cuenta.events;

import co.com.ddd.cuenta.values.CuentaId;
import co.com.ddd.cuenta.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreActualizado extends DomainEvent {
    private final CuentaId cuentaId;
    private final Nombre nombre;

    public NombreActualizado(CuentaId cuentaId, Nombre nombre) {
        super("sofka.cuenta.NombreActualizado");
        this.cuentaId = cuentaId;
        this.nombre = nombre;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
