package co.com.ddd.ventaautomovil.commands;

import co.com.ddd.ventaautomovil.values.Cantidad;
import co.com.ddd.ventaautomovil.values.FacturaId;
import co.com.sofka.domain.generic.Command;

public class ActualizarCantidad extends Command {
    private final FacturaId facturaId;
    private final Cantidad cantidad;

    public ActualizarCantidad(FacturaId facturaId, Cantidad cantidad) {
        this.facturaId = facturaId;
        this.cantidad = cantidad;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }
}
