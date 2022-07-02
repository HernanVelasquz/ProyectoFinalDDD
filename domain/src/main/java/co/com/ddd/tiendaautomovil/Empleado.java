package co.com.ddd.tiendaautomovil;

import co.com.ddd.tiendaautomovil.values.DocumentoEmpleado;
import co.com.ddd.tiendaautomovil.values.Email;
import co.com.ddd.tiendaautomovil.values.EmpleadoId;
import co.com.ddd.tiendaautomovil.values.Nombre;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Empleado extends Entity<EmpleadoId> {
    protected DocumentoEmpleado documentoEmpleado;
    protected Email email;
    protected Nombre nombre;

    public Empleado(EmpleadoId empleadoId, DocumentoEmpleado documentoEmpleado, Email email, Nombre nombre) {
        super(empleadoId);
        this.documentoEmpleado = documentoEmpleado;
        this.email = email;
        this.nombre = nombre;
    }
    public void actualizarDocumentoEmpleado(DocumentoEmpleado documentoEmpleado){
        this.documentoEmpleado = Objects.requireNonNull(documentoEmpleado);
    }
    public void actualizarEmailEmpleado(Email email){
        this.email = email.cambiaremail(Objects.requireNonNull(email.value()));
    }
    public void actualizarNombreEmpleado(Nombre nombre){
        this.nombre = nombre.cambiarNombre(Objects.requireNonNull(nombre.value()));
    }
    public DocumentoEmpleado documentoEmpleado() {
        return documentoEmpleado;
    }

    public Email email() {
        return email;
    }

    public Nombre nombre() {
        return nombre;
    }
}
