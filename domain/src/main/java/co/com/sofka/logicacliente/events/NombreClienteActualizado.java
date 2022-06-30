package co.com.sofka.logicacliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicacliente.values.Nombre;

public class NombreClienteActualizado extends DomainEvent {
    private final Nombre nombre;

    public NombreClienteActualizado(Nombre nombre) {
        super("sofka.logicacliente.nombreclienteactualizado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
