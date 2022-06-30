package co.com.sofka.logicacliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicacliente.values.ClienteId;
import co.com.sofka.logicacliente.values.DireccionId;
import co.com.sofka.logicacliente.values.Nomenclatura;

public class ActualizarNomenclaturaCliente extends Command {
    private final ClienteId clienteId;
    private final DireccionId direccionId;
    private final Nomenclatura nomenclatura;

    public ActualizarNomenclaturaCliente(ClienteId clienteId, DireccionId direccionId, Nomenclatura nomenclatura) {
        this.clienteId = clienteId;
        this.direccionId = direccionId;
        this.nomenclatura = nomenclatura;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public DireccionId getDireccionId() {
        return direccionId;
    }

    public Nomenclatura getNomenclatura() {
        return nomenclatura;
    }
}
