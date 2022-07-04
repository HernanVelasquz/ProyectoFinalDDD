package co.com.ddd.tiendaautomovil.events;

import co.com.ddd.tiendaautomovil.values.Email;
import co.com.ddd.tiendaautomovil.values.EmpleadoId;
import co.com.ddd.tiendaautomovil.values.TiendadId;
import co.com.sofka.domain.generic.DomainEvent;

public class EmailEmpleadoActualizado extends DomainEvent {
    private final EmpleadoId empleadoId;
    private final Email email;

    public EmailEmpleadoActualizado(EmpleadoId empleadoId, Email email) {
        super("sofka.tiendaautomovil.EmailEmpleadoActualizado");
        this.empleadoId = empleadoId;
        this.email = email;
    }

    public EmpleadoId empleadoId() {
        return empleadoId;
    }

    public Email email() {
        return email;
    }
}
