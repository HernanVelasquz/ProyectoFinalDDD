package co.com.ddd.tiendaautomovil;

import co.com.ddd.tiendaautomovil.events.*;
import co.com.ddd.tiendaautomovil.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;

public class TiendaAutomovil extends AggregateEvent<TiendadId> {
    protected TiendadId tiendadId;
    protected Empleado empleado;
    protected Producto producto;
    protected ServicioVenta servicioVenta;
    private EmpleadoId empleadoId;
    private ProductoId productoId;
    private ServicioVentaId servicioVentaId;

    public TiendaAutomovil(TiendadId entityId, EmpleadoId empleadoId, DocumentoEmpleado documentoEmpleado, Email email, Nombre nombre, ProductoId idProducto, DescripcioProducto descripcioProducto, Precio precio, Marca marca, ServicioVentaId servicioVentaId, InformacioAsesorVenta asesorVenta) {
        super(entityId);
        this.empleadoId = empleadoId;
        this.productoId = idProducto;
        this.servicioVentaId = servicioVentaId;
        Objects.requireNonNull(empleadoId);
        Objects.requireNonNull(documentoEmpleado);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(email);
        Objects.requireNonNull(idProducto);
        Objects.requireNonNull(descripcioProducto);
        Objects.requireNonNull(precio);
        Objects.requireNonNull(marca);
        Objects.requireNonNull(servicioVentaId);
        Objects.requireNonNull(asesorVenta);
        var tiendaId = new TiendadId();
        appendChange(new TiendaAutomovilCreada(tiendaId,empleadoId,documentoEmpleado,nombre,email,idProducto,descripcioProducto,precio,marca,servicioVentaId,asesorVenta)).apply();
        subscribe(new TiendaAutomovilChange(this));
    }
    public static TiendaAutomovil from(TiendadId id, List<DomainEvent> events){
        var tienda = new TiendaAutomovil((id));
        events.forEach(tienda::applyEvent);
        return tienda;
    }

    private TiendaAutomovil(TiendadId id){
        super(id);
        subscribe(new TiendaAutomovilChange(this));
    }
    public void actualizarDocumentoEmpleado(EmpleadoId empleadoId, DocumentoEmpleado documentoEmpleado){
        Objects.requireNonNull(empleadoId);
        Objects.requireNonNull(documentoEmpleado);
        appendChange(new DocumentoEmpleadoActualizado(empleadoId,documentoEmpleado)).apply();
    }

    public void actualizarEmailEmpleado(EmpleadoId empleadoId, Email email){
        Objects.requireNonNull(empleadoId);
        Objects.requireNonNull(email);
        appendChange(new EmailEmpleadoActualizado(empleadoId,email)).apply();
    }

    public void actualizarNombreEmpleado(EmpleadoId empleadoId,Nombre nombre){
        Objects.requireNonNull(empleadoId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreEmpleadoActualizado(empleadoId, nombre)).apply();
    }

    public void cambiarAsesor(ServicioVentaId servicioVentaId, InformacioAsesorVenta informacioAsesorVenta){
        Objects.requireNonNull(servicioVentaId);
        Objects.requireNonNull(informacioAsesorVenta);
        appendChange(new AsesorCambiado(servicioVentaId, informacioAsesorVenta)).apply();
    }
}
