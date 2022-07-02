package co.com.ddd.tiendaautomovil;

import co.com.ddd.tiendaautomovil.values.InformacioAsesorVenta;
import co.com.ddd.tiendaautomovil.values.ServicioVentaId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class ServicioVenta extends Entity<ServicioVentaId> {
    protected InformacioAsesorVenta asesorVenta;

    public ServicioVenta(ServicioVentaId servicioVentaId, InformacioAsesorVenta asesorVenta) {
        super (servicioVentaId);
        this.asesorVenta = asesorVenta;
    }

    public void actualizarNombreAsesor(InformacioAsesorVenta informacioAsesorVenta){
        this.asesorVenta = informacioAsesorVenta.cambiarNombreAsesor(Objects.requireNonNull(informacioAsesorVenta.value().nombreAsesor()));
    }
    public void actualizarTipoDocumentoAsesor(InformacioAsesorVenta informacioAsesorVenta){
        this.asesorVenta = informacioAsesorVenta.cambiarTipoDocumentoAsesor(Objects.requireNonNull(informacioAsesorVenta.value().tipoDocumeto()));
    }

    public void actualizarNumeroDocumentoAsesor(InformacioAsesorVenta informacioAsesorVenta){
        this.asesorVenta = informacioAsesorVenta.cambiarNumeroDocumentoAsesor(Objects.requireNonNull(informacioAsesorVenta.value().numeroDocumento()));
    }

    public InformacioAsesorVenta getAsesorVenta() {
        return asesorVenta;
    }
}
