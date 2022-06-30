package co.com.sofka.logicacliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicacliente.events.*;
import co.com.sofka.logicacliente.values.*;

import java.util.List;
import java.util.Objects;

public class Cliente extends AggregateEvent<ClienteId> {
    protected DocumentoCliente documentoCliente;
    protected Celular celular;
    protected Direccion direccion;
    protected Nombre nombre;
    private DocumentoId documentoId;
    private TipoDocumento tipoDocumento;
    private NumeroDocumento numeroDocumento;
    private CelularId celularId;
    private Operador operador;
    private NumeroCelular numeroCelular;
    private DireccionId direccionId;
    private Calle calle;
    private Nomenclatura nomenclatura;

    public Cliente(ClienteId entityId, DocumentoCliente documentoCliente, Celular celular, Direccion direccion, Nombre nombre) {
        super(entityId);
        this.documentoCliente = documentoCliente;
        this.celular = celular;
        this.direccion = direccion;
        this.nombre = nombre;
        Objects.requireNonNull(documentoCliente);
        Objects.requireNonNull(celular);
        Objects.requireNonNull(direccion);
        Objects.requireNonNull(nombre);
        var clieteId = new ClienteId();
    }

    public Cliente(ClienteId clienteId){
        super(clienteId);
        //CrearClase el Singleton
    }

    public static Cliente from(ClienteId clienteId, List<DomainEvent> events){
        var cliente = new Cliente(clienteId);
        events.forEach(cliente::applyEvent);
        return cliente;
    }

    public void actualizarTipoDocumentoCliente(DocumentoId documentoId, TipoDocumento tipoDocumento){
        this.documentoId = documentoId;
        this.tipoDocumento = tipoDocumento;
        Objects.requireNonNull(documentoId);
        Objects.requireNonNull(tipoDocumento);
        appendChange(new TipoDocumentoClienteActualizado(documentoId, tipoDocumento)).apply();
    }

    public void actualizarNumeroDocumentoCliente(DocumentoId documentoId, NumeroDocumento numeroDocumento){
        this.documentoId = documentoId;
        this.numeroDocumento = numeroDocumento;
        Objects.requireNonNull(documentoId);
        Objects.requireNonNull(numeroDocumento);
        appendChange(new NumeroDocumentoClienteActualizado(documentoId, numeroDocumento)).apply();
    }
    public void actualizarOperadorDocumentoCliente(CelularId celularId, Operador operador){
        this.celularId = celularId;
        this.operador = operador;
        Objects.requireNonNull(celularId);
        Objects.requireNonNull(operador);
        appendChange(new OperadorCelularClienteActalizado(celularId, operador)).apply();
    }

    public void actualizarNumeroCelularCliente(CelularId celularId, NumeroCelular numeroCelular){
        this.celularId = celularId;
        this.numeroCelular = numeroCelular;
        Objects.requireNonNull(celularId);
        Objects.requireNonNull(numeroCelular);
        appendChange(new NumeroCelularClienteActualizado(celularId,numeroCelular)).apply();
    }

    private void actualizarCalleDelCliente(DireccionId direccionId, Calle calle){
        this.direccionId = direccionId;
        this.calle = calle;
        Objects.requireNonNull(direccionId);
        Objects.requireNonNull(calle);
        appendChange(new CalleClienteActualizada(direccionId,calle)).apply();
    }

    private void actualizarNomenclaturaCliente(DireccionId direccionId, Nomenclatura nomenclatura){
        this.direccionId = direccionId;
        this.nomenclatura = nomenclatura;
        Objects.requireNonNull(direccionId);
        Objects.requireNonNull(nomenclatura);
        appendChange(new NomenclaturaClienteActualizada(direccionId,nomenclatura)).apply();
    }

    private void actualizarNombreCliente(Nombre nombre){
        this.nombre = nombre;
        Objects.requireNonNull(nombre);
        appendChange(new NombreClienteActualizado(nombre)).apply();
    }

    public DocumentoCliente getDocumentoCliente() {
        return documentoCliente;
    }

    public Celular getCelular() {
        return celular;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
