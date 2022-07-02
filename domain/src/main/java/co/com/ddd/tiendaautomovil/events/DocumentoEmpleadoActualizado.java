package co.com.ddd.tiendaautomovil.events;

import co.com.ddd.tiendaautomovil.values.DocumentoEmpleado;
import co.com.ddd.tiendaautomovil.values.EmpleadoId;
import co.com.sofka.domain.generic.DomainEvent;

public class DocumentoEmpleadoActualizado extends DomainEvent {
    private final EmpleadoId empleadoId;
    private final DocumentoEmpleado documentoEmpleado;

    public DocumentoEmpleadoActualizado(EmpleadoId empleadoId, DocumentoEmpleado documentoEmpleado) {
        super("sofka.tiendaautomovil.DocumentoEmpleadoActualizado");
        this.empleadoId = empleadoId;
        this.documentoEmpleado = documentoEmpleado;
    }

    public EmpleadoId empleadoId() {
        return empleadoId;
    }

    public DocumentoEmpleado documentoEmpleado() {
        return documentoEmpleado;
    }
}
