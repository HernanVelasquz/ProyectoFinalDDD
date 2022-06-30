package co.com.sofka.logicacliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicacliente.values.CelularId;
import co.com.sofka.logicacliente.values.ClienteId;
import co.com.sofka.logicacliente.values.NumeroCelular;

public class ActualizarNumeroCelularCliente extends Command {
    private final ClienteId clienteId;
    private final CelularId celularId;
    private final NumeroCelular numeroCelular;

    public ActualizarNumeroCelularCliente(ClienteId clienteId, CelularId celularId, NumeroCelular numeroCelular) {
        this.clienteId = clienteId;
        this.celularId = celularId;
        this.numeroCelular = numeroCelular;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public CelularId getCelularId() {
        return celularId;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
