package co.com.ddd.ventaautomovil;

import co.com.ddd.ventaautomovil.events.CantidadActualizada;
import co.com.ddd.ventaautomovil.events.InformacionCompraVehiculoActualizada;
import co.com.ddd.ventaautomovil.events.VentaAutomovilCreada;
import co.com.sofka.domain.generic.EventChange;

import java.awt.color.ICC_ColorSpace;

public class VentaAuthomovilChange extends EventChange {
    public VentaAuthomovilChange(VentaAutomovil ventaAutomovil) {
        apply((VentaAutomovilCreada event) ->{
            ventaAutomovil.cuentaId = event.cuentaId();
            ventaAutomovil.cliente = new Cliente(event.clienteId(),event.documentoCliente(), event.celular(),event.nombre(), event.direccion());
            ventaAutomovil.factura = new Factura(event.facturaId(), event.cantidad(),event.informacionCompra(),event.fecha());
        });

        apply((CantidadActualizada event) ->{
            ventaAutomovil.factura.actualizarCantidad(event.cantidad());
        });

        apply((InformacionCompraVehiculoActualizada event) ->{
            ventaAutomovil.factura.actualizarMarca(event.informacionCompra());
        });

        apply((InformacionCompraVehiculoActualizada event) ->{
            ventaAutomovil.factura.actualizarTipoVehiculo(event.informacionCompra());
        });
        apply((InformacionCompraVehiculoActualizada event ) -> {
            ventaAutomovil.factura.actualizarModeloVehiculo(event.informacionCompra());
        });
    }
}
