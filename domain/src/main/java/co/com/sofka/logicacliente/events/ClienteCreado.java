package co.com.sofka.logicacliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicacliente.values.CelularId;
import co.com.sofka.logicacliente.values.ClienteId;
import co.com.sofka.logicacliente.values.DireccionId;
import co.com.sofka.logicacliente.values.Nombre;

public class ClienteCreado extends DomainEvent {
    private final ClienteId clienteId;
    private final Nombre nombre;
    private final DireccionId direccionId;
    private final CelularId celularId;

    public ClienteCreado(ClienteId clienteId, Nombre nombre, DireccionId direccionId, CelularId celularId) {
        super("sofka.logicacliente.clientecreado");
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.direccionId = direccionId;
        this.celularId = celularId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public DireccionId getDireccionId() {
        return direccionId;
    }

    public CelularId getCelularId() {
        return celularId;
    }
}
