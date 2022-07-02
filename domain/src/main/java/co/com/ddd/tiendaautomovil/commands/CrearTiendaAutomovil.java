package co.com.ddd.tiendaautomovil.commands;

import co.com.ddd.tiendaautomovil.values.*;
import co.com.sofka.domain.generic.Command;

public class CrearTiendaAutomovil extends Command {
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

    public CrearTiendaAutomovil(TiendadId tiendadId, EmpleadoId empleadoId, DocumentoEmpleado documentoEmpleado, Email email, Nombre nombre, ProductoId idProducto, DescripcioProducto descripcioProducto, Precio precio, Marca marca, ServicioVentaId servicioVentaId, InformacioAsesorVenta asesorVenta) {
        this.tiendadId = tiendadId;
        this.empleadoId = empleadoId;
        this.documentoEmpleado = documentoEmpleado;
        this.email = email;
        this.nombre = nombre;
        this.idProducto = idProducto;
        this.descripcioProducto = descripcioProducto;
        this.precio = precio;
        this.marca = marca;
        this.servicioVentaId = servicioVentaId;
        this.asesorVenta = asesorVenta;
    }

    public TiendadId getTiendadId() {
        return tiendadId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public DocumentoEmpleado getDocumentoEmpleado() {
        return documentoEmpleado;
    }

    public Email getEmail() {
        return email;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public ProductoId getIdProducto() {
        return idProducto;
    }

    public DescripcioProducto getDescripcioProducto() {
        return descripcioProducto;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Marca getMarca() {
        return marca;
    }

    public ServicioVentaId getServicioVentaId() {
        return servicioVentaId;
    }

    public InformacioAsesorVenta getAsesorVenta() {
        return asesorVenta;
    }
}
