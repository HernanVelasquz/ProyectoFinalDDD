package co.com.ddd.ventaautomovil;


import co.com.ddd.cuenta.values.CuentaId;
import co.com.ddd.ventaautomovil.events.*;
import co.com.ddd.ventaautomovil.values.*;
import co.com.sofka.domain.generic.AggregateEvent;


import java.util.Objects;

public class VentaAutomovil extends AggregateEvent<VentaAutomovilId> {
//    protected final Factura factura;
    private final CuentaId cuentaId;
    private FacturaId facturaId;
    private ClienteId clienteId;

    public VentaAutomovil(VentaAutomovilId entityId, CuentaId cuentaId, FacturaId facturaId, ClienteId clienteId) {
        super(entityId);
        this.cuentaId = cuentaId;
        this.facturaId = facturaId;
        this.clienteId = clienteId;;
        Objects.requireNonNull(facturaId);
        Objects.requireNonNull(clienteId);
        Objects.requireNonNull(cuentaId);
        var ventaAutomovilId = new VentaAutomovilId();
        appendChange(new VentaAutomovilCreada(ventaAutomovilId,cuentaId,facturaId,clienteId)).apply();
    }

    public void agregarFactura(FacturaId facturaId, Cantidad cantidad, InformacionCompra informacionCompra, Fecha fecha){
        Objects.requireNonNull(facturaId);
        Objects.requireNonNull(cantidad);
        Objects.requireNonNull(informacionCompra);
        Objects.requireNonNull(fecha);
        appendChange(new FacturaAgregada(facturaId,cantidad,informacionCompra,fecha)).apply();
    }
    public void agregarCliente(ClienteId clienteId, DocumentoCliente documentoCliente, Celular celular, Direccion direccion, Nombre nombre){
        Objects.requireNonNull(clienteId);
        Objects.requireNonNull(documentoCliente);
        Objects.requireNonNull(celular);
        Objects.requireNonNull(direccion);
        Objects.requireNonNull(nombre);
        appendChange(new ClienteAgregado(clienteId,documentoCliente,celular,direccion,nombre)).apply();
    }
    public void crearCuentaVenta(CuentaId cuentaId){
        Objects.requireNonNull(cuentaId);
       appendChange(new CrearCuentaVenta(cuentaId)).apply();
    }

    public void eliminarCuenta(CuentaId cuentaId) {
        Objects.requireNonNull(cuentaId);
        appendChange(new CuentaEliminada(cuentaId)).apply();
    }

    public void cancelarFactura(FacturaId facturaId){
        Objects.requireNonNull(facturaId);
        appendChange(new FacturaCancelada(facturaId)).apply();
    }
}
