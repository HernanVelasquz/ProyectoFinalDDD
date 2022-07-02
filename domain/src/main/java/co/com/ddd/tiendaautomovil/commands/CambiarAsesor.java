package co.com.ddd.tiendaautomovil.commands;

import co.com.ddd.tiendaautomovil.values.InformacioAsesorVenta;
import co.com.ddd.tiendaautomovil.values.ServicioVentaId;
import co.com.sofka.domain.generic.Command;

public class CambiarAsesor extends Command {
    private final ServicioVentaId servicioVentaId;
    private final InformacioAsesorVenta informacionVenta;

    public CambiarAsesor(ServicioVentaId servicioVentaId, InformacioAsesorVenta informacionVenta) {
        this.servicioVentaId = servicioVentaId;
        this.informacionVenta = informacionVenta;
    }

    public ServicioVentaId getServicioVentaId() {
        return servicioVentaId;
    }

    public InformacioAsesorVenta getInformacionVenta() {
        return informacionVenta;
    }
}
