package co.com.ddd.cuenta.events;

import co.com.ddd.cuenta.values.MenuAutosId;
import co.com.ddd.cuenta.values.Nombre;
import co.com.ddd.tiendaautomovil.values.Marca;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreActualizado extends DomainEvent {
    private final MenuAutosId menuAutosId;
    private final Nombre nombre;
    public NombreActualizado(MenuAutosId menuAutosId, Nombre nombre) {
        super("sofka.cuenta.NombreActualizado");
        this.menuAutosId =  menuAutosId;
        this.nombre = nombre;
    }

    public MenuAutosId menuAutosId() {
        return menuAutosId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
