package co.com.ddd.cuenta.commands;

import co.com.ddd.tiendaautomovil.values.Email;
import co.com.ddd.tiendaautomovil.TiendaAutomovil;
import co.com.ddd.tiendaautomovil.values.EmpleadoId;
import co.com.ddd.tiendaautomovil.values.TiendadId;
import co.com.sofka.domain.generic.Command;

public class ActualizarEmailCommand extends Command {
    private final TiendadId tiendaId;
    private final EmpleadoId empleadoId;
    private final Email email;

    public ActualizarEmailCommand(TiendadId tiendadId, EmpleadoId empleadoId, Email email) {
        this.tiendaId = tiendadId;
        this.empleadoId = empleadoId;
        this.email = email;
    }

    public TiendadId getTiendaId() {
        return tiendaId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Email getEmail() {
        return email;
    }
}
