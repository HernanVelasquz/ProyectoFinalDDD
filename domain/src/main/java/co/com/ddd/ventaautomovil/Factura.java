package co.com.ddd.ventaautomovil;

import co.com.ddd.ventaautomovil.values.Fecha;
import co.com.ddd.ventaautomovil.values.InformacionCompra;
import co.com.sofka.domain.generic.Entity;
import co.com.ddd.ventaautomovil.values.Cantidad;
import co.com.ddd.ventaautomovil.values.FacturaId;

import java.util.Objects;

public class Factura extends Entity<FacturaId> {
    protected Cantidad cantidad;
    protected InformacionCompra informacionCompra;
    protected Fecha fecha;

    public Factura(FacturaId entityId, Cantidad cantidad, InformacionCompra informacionCompra, Fecha fecha) {
        super(entityId);
        this.cantidad = cantidad;
        this.informacionCompra = informacionCompra;
        this.fecha = fecha;
    }

    public void actualizarCantidad(Cantidad cantidad){
        this.cantidad = cantidad.cambiarCantidad(Objects.requireNonNull(cantidad.value()));
    }

    public void actualizarModeloVehiculo(InformacionCompra informacionCompra){
        this.informacionCompra = informacionCompra.cambarModeloVehiculo(informacionCompra.value().modelo());
    }
    public void actualizarTipoVehiculo(InformacionCompra informacionCompra){
        this.informacionCompra = informacionCompra.cambarTipoVehiculo(informacionCompra.value().tipoVehiculo());
    }
    public void actualizarMarca(InformacionCompra informacionCompra){
        this.informacionCompra = informacionCompra.cambarMarcaVehiculo(informacionCompra.value().marca());
    }

    public Cantidad getCantidad() {
        return cantidad;
    }

    public InformacionCompra getInformacionCompra() {
        return informacionCompra;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
