package co.com.ddd.cuenta.events;

import co.com.ddd.cuenta.values.CuentaId;
import co.com.ddd.cuenta.values.MenuAutosId;
import co.com.ddd.cuenta.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

public class PrecioActualizado extends DomainEvent {
    private final MenuAutosId menuAutosId;
    private final Precio precio;

    public PrecioActualizado(MenuAutosId menuAutosId, Precio precio) {
        super("sofka.cuenta.ActualizarPrecio");
        this.menuAutosId = menuAutosId;
        this.precio = precio;
    }

    public MenuAutosId getMenuAutosId() {
        return menuAutosId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
