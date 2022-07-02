package co.com.ddd.ventaautomovil;


import co.com.ddd.cuenta.values.CuentaId;
import co.com.ddd.ventaautomovil.events.InformacionCompraVehiculoActualizada;
import co.com.ddd.ventaautomovil.events.*;
import co.com.ddd.ventaautomovil.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;


import java.util.List;
import java.util.Objects;

public class VentaAutomovil extends AggregateEvent<VentaAutomovilId> {
    protected CuentaId cuentaId;
    protected Factura factura;
    protected Cliente cliente;
    private FacturaId facturaId;
    private ClienteId clienteId;

    public VentaAutomovil(VentaAutomovilId entityId, CuentaId cuentaId,FacturaId facturaId, Cantidad cantidad, InformacionCompra informacionCompra, Fecha fecha, ClienteId clienteId, DocumentoCliente documentoCliente, Celular celular, Nombre nombre, Direccion direccion) {
        super(entityId);
        Objects.requireNonNull(cuentaId);
        Objects.requireNonNull(facturaId);
        Objects.requireNonNull(cantidad);
        Objects.requireNonNull(informacionCompra);
        Objects.requireNonNull(fecha);
        Objects.requireNonNull(clienteId);
        Objects.requireNonNull(documentoCliente);
        Objects.requireNonNull(celular);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(direccion);
        var ventaAutomovilId = new VentaAutomovilId();
        appendChange(new VentaAutomovilCreada(ventaAutomovilId,cuentaId,facturaId,cantidad,informacionCompra,fecha,clienteId,documentoCliente,celular,nombre,direccion)).apply();
        subscribe(new VentaAuthomovilChange(this));
    }

    public static VentaAutomovil from(VentaAutomovilId id, List<DomainEvent> events){
        var ventaAutomovil = new VentaAutomovil((id));
        events.forEach(ventaAutomovil::applyEvent);
        return ventaAutomovil;
    }

    private VentaAutomovil(VentaAutomovilId id){
        super(id);
        subscribe(new VentaAuthomovilChange(this));
    }

    public void actualizarCantidad(FacturaId facturaId, Cantidad cantidad){
        Objects.requireNonNull(facturaId);
        Objects.requireNonNull(cantidad);
        appendChange(new CantidadActualizada(facturaId, cantidad)).apply();
    }

    public void actualizarInfomacionVehiculo(FacturaId facturaId, InformacionCompra informacionCompra){
        Objects.requireNonNull(facturaId);
        Objects.requireNonNull(informacionCompra);
        appendChange(new InformacionCompraVehiculoActualizada(facturaId, informacionCompra)).apply();
    }
}
