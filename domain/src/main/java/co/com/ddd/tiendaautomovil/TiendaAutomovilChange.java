package co.com.ddd.tiendaautomovil;

import co.com.ddd.tiendaautomovil.events.*;
import co.com.sofka.domain.generic.EventChange;

public class TiendaAutomovilChange extends EventChange {
    public TiendaAutomovilChange(TiendaAutomovil tiendaAutomovil) {
        apply((TiendaAutomovilCreada event) ->{
            tiendaAutomovil.tiendadId = event.tiendadId();
            tiendaAutomovil.empleado = new Empleado(event.empleadoId(),event.documentoEmpleado(),event.email(), event.nombre());
            tiendaAutomovil.producto = new Producto(event.idProducto(), event.descripcioProducto(),event.precio(), event.marca());
            tiendaAutomovil.servicioVenta = new ServicioVenta(event.servicioVentaId(), event.asesorVenta());
        });

        apply((DocumentoEmpleadoActualizado event) ->{
            tiendaAutomovil.empleado.actualizarDocumentoEmpleado(event.documentoEmpleado());
        });

        apply((EmailEmpleadoActualizado event)->{
            tiendaAutomovil.empleado.actualizarEmailEmpleado(event.email());
        });

        apply((NombreEmpleadoActualizado event) ->{
            tiendaAutomovil.empleado.actualizarNombreEmpleado(event.nombre());
        });

        apply((AsesorCambiado event)->{
            tiendaAutomovil.servicioVenta.actualizarNombreAsesor(event.informacionVenta());
        });

        apply((AsesorCambiado event)->{
            tiendaAutomovil.servicioVenta.actualizarNumeroDocumentoAsesor(event.informacionVenta());
        });

        apply((AsesorCambiado event)->{
            tiendaAutomovil.servicioVenta.actualizarNumeroDocumentoAsesor(event.informacionVenta());
        });
    }
}
