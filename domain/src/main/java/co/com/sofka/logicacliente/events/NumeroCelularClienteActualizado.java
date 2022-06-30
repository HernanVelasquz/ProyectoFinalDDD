package co.com.sofka.logicacliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicacliente.values.CelularId;
import co.com.sofka.logicacliente.values.NumeroCelular;

public class NumeroCelularClienteActualizado extends DomainEvent {
    private final CelularId celularId;
    private final NumeroCelular numeroCelular;

    public NumeroCelularClienteActualizado(CelularId celularId, NumeroCelular numeroCelular) {
        super("sofka.logicacliente.numerocelularclienteactualizado");
        this.celularId = celularId;
        this.numeroCelular = numeroCelular;
    }

    public CelularId getCelularId() {
        return celularId;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
