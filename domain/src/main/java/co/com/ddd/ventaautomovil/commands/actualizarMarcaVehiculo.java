package co.com.ddd.ventaautomovil.commands;

import co.com.ddd.ventaautomovil.values.FacturaId;
import co.com.ddd.ventaautomovil.values.InformacionCompra;
import co.com.sofka.domain.generic.Command;

public class actualizarMarcaVehiculo extends Command {
    private final FacturaId facturaId;
    private final InformacionCompra informacionCompra;


    public actualizarMarcaVehiculo(FacturaId facturaId, InformacionCompra informacionCompra) {
        this.facturaId = facturaId;
        this.informacionCompra = informacionCompra;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public InformacionCompra getInformacionCompra() {
        return informacionCompra;
    }
}