package co.com.ddd.tiendaautomovil.commands;

import co.com.ddd.tiendaautomovil.values.Email;
import co.com.ddd.tiendaautomovil.values.EmpleadoId;
import co.com.sofka.domain.generic.Command;

public class ActualizarEmailEmpleadoCommand extends Command {
    private final EmpleadoId empleadoId;
    private final Email email;

    public ActualizarEmailEmpleadoCommand(EmpleadoId empleadoId, Email email) {
        this.empleadoId = empleadoId;
        this.email = email;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Email getEmail() {
        return email;
    }
}
