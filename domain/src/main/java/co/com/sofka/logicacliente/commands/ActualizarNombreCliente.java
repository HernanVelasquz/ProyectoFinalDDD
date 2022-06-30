package co.com.sofka.logicacliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicacliente.values.ClienteId;
import co.com.sofka.logicacliente.values.Nombre;


public class ActualizarNombreCliente extends Command {
    private final ClienteId clienteId;
    private final Nombre nombre;

    public ActualizarNombreCliente(ClienteId clienteId, Nombre nombre) {
        this.clienteId = clienteId;
        this.nombre = nombre;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
