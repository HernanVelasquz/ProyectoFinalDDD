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

    public void editarCantidad(Cantidad cantidad){
        this.cantidad = Objects.requireNonNull(cantidad);
    }

    public void editarInformacionCompra(InformacionCompra informacionCompra){
        this.informacionCompra = Objects.requireNonNull(informacionCompra);
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
