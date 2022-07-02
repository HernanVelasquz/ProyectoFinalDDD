package co.com.ddd.tiendaautomovil.events;

import co.com.ddd.tiendaautomovil.values.EmpleadoId;
import co.com.ddd.tiendaautomovil.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreEmpleadoActualizado extends DomainEvent {
    private final EmpleadoId empleadoId;
    private final Nombre nombre;

    public NombreEmpleadoActualizado(EmpleadoId empleadoId, Nombre nombre) {
        super("sofka.tiendaautomovil.NombreEmpleadoActualizado");
        this.empleadoId = empleadoId;
        this.nombre = nombre;
    }

    public EmpleadoId empleadoId() {
        return empleadoId;
    }

    public Nombre nombre() {
        return nombre;
    }
}
