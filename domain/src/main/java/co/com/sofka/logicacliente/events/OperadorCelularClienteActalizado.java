package co.com.sofka.logicacliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicacliente.values.CelularId;
import co.com.sofka.logicacliente.values.Operador;

public class OperadorCelularClienteActalizado extends DomainEvent {
    private final CelularId celularId;
    private final Operador operador;

    public OperadorCelularClienteActalizado(CelularId celularId, Operador operador) {
        super("sofka.logicacliente.operadorcelularclienteactalizado");
        this.celularId = celularId;
        this.operador = operador;
    }

    public CelularId getCelularId() {
        return celularId;
    }

    public Operador getOperador() {
        return operador;
    }
}
