package co.com.ddd.tiendaautomovil.commands;

import co.com.ddd.tiendaautomovil.values.EmpleadoId;
import co.com.ddd.tiendaautomovil.values.Nombre;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreEmpleado extends Command {
    private final EmpleadoId empleadoId;
    private final Nombre nombre;

    public ActualizarNombreEmpleado(EmpleadoId empleadoId, Nombre nombre) {
        this.empleadoId = empleadoId;
        this.nombre = nombre;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
