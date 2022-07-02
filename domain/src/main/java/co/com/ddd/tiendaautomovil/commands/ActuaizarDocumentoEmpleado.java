package co.com.ddd.tiendaautomovil.commands;

import co.com.ddd.tiendaautomovil.values.DocumentoEmpleado;
import co.com.ddd.tiendaautomovil.values.EmpleadoId;
import co.com.sofka.domain.generic.Command;

public class ActuaizarDocumentoEmpleado extends Command {
    private final EmpleadoId empleadoId;
    private final DocumentoEmpleado documentoEmpleado;

    public ActuaizarDocumentoEmpleado(EmpleadoId empleadoId, DocumentoEmpleado documentoEmpleado) {
        this.empleadoId = empleadoId;
        this.documentoEmpleado = documentoEmpleado;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public DocumentoEmpleado getDocumentoEmpleado() {
        return documentoEmpleado;
    }
}
