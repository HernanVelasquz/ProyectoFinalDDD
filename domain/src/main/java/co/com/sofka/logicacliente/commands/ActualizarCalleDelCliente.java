package co.com.sofka.logicacliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicacliente.values.Calle;
import co.com.sofka.logicacliente.values.ClienteId;
import co.com.sofka.logicacliente.values.DireccionId;

public class ActualizarCalleDelCliente extends Command {
    private final ClienteId clienteId;
    private final DireccionId direccionId;
    private final Calle calle;

    public ActualizarCalleDelCliente(ClienteId clienteId, DireccionId direccionId, Calle calle) {
        this.clienteId = clienteId;
        this.direccionId = direccionId;
        this.calle = calle;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public DireccionId getDireccionId() {
        return direccionId;
    }

    public Calle getCalle() {
        return calle;
    }
}
