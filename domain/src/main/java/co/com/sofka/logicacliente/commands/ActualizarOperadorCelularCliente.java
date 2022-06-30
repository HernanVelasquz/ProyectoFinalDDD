package co.com.sofka.logicacliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicacliente.values.CelularId;
import co.com.sofka.logicacliente.values.ClienteId;
import co.com.sofka.logicacliente.values.Operador;

public class ActualizarOperadorCelularCliente extends Command {
    private final ClienteId clienteId;
    private final CelularId celularId;
    private final Operador operador;

    public ActualizarOperadorCelularCliente(ClienteId clienteId, CelularId celularId, Operador operador) {
        this.clienteId = clienteId;
        this.celularId = celularId;
        this.operador = operador;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public CelularId getCelularId() {
        return celularId;
    }

    public Operador getOperador() {
        return operador;
    }
}
