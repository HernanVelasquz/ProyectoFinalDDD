package co.com.ddd.tiendaautomovil.events;

import co.com.ddd.tiendaautomovil.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class TiendaAutomovilCreada extends DomainEvent {
    private final TiendadId tiendadId;
    private final EmpleadoId empleadoId;
    private final DocumentoEmpleado documentoEmpleado;
    private final Email email;
    private final Nombre nombre;
    private final ProductoId idProducto;
    private final DescripcioProducto descripcioProducto;
    private final Precio precio;
    private final Marca marca;
    private final ServicioVentaId servicioVentaId;
    private final InformacioAsesorVenta asesorVenta;
    public TiendaAutomovilCreada(TiendadId tiendadId, EmpleadoId empleadoId, DocumentoEmpleado documentoEmpleado, Nombre nombre, Email email, ProductoId idProducto, DescripcioProducto descripcioProducto, Precio precio, Marca marca, ServicioVentaId servicioVentaId, InformacioAsesorVenta asesorVenta) {
        super("sofka.tiendaautomovil.TiendaAutomovilCreada");
        this.tiendadId = tiendadId;
        this.empleadoId = empleadoId;
        this.documentoEmpleado = documentoEmpleado;
        this.nombre = nombre;
        this.email =email;
        this.idProducto = idProducto;
        this.descripcioProducto = descripcioProducto;
        this.precio = precio;
        this.marca = marca;
        this.servicioVentaId = servicioVentaId;
        this.asesorVenta = asesorVenta;
    }

    public TiendadId tiendadId() {
        return tiendadId;
    }

    public EmpleadoId empleadoId() {
        return empleadoId;
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

    public ProductoId idProducto() {
        return idProducto;
    }

    public DescripcioProducto descripcioProducto() {
        return descripcioProducto;
    }

    public Precio precio() {
        return precio;
    }

    public Marca marca() {
        return marca;
    }

    public ServicioVentaId servicioVentaId() {
        return servicioVentaId;
    }

    public InformacioAsesorVenta asesorVenta() {
        return asesorVenta;
    }
}
