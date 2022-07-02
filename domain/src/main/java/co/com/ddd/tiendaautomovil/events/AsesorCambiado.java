package co.com.ddd.tiendaautomovil.events;

import co.com.ddd.tiendaautomovil.values.InformacioAsesorVenta;
import co.com.ddd.tiendaautomovil.values.ServicioVentaId;
import co.com.sofka.domain.generic.DomainEvent;

public class AsesorCambiado extends DomainEvent {
    private final ServicioVentaId servicioVentaId;
    private final InformacioAsesorVenta informacionVenta;

    public AsesorCambiado(ServicioVentaId servicioVentaId, InformacioAsesorVenta informacioAsesorVenta) {
        super("sofka.tiendaautomovil.DocumentoEmpleadoActualizado");
        this.servicioVentaId = servicioVentaId;
        this.informacionVenta = informacioAsesorVenta;
    }

    public ServicioVentaId servicioVentaId() {
        return servicioVentaId;
    }

    public InformacioAsesorVenta informacionVenta() {
        return informacionVenta;
    }
}
