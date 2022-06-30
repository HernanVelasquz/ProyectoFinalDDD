package co.com.sofka.logicacliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicacliente.values.Calle;
import co.com.sofka.logicacliente.values.DireccionId;

public class CalleClienteActualizada extends DomainEvent {
    private final DireccionId direccionId;
    private final Calle calle;

    public CalleClienteActualizada(DireccionId direccionId, Calle calle) {
        super("sofka.logicacliente.calleclienteactualizada");
        this.direccionId = direccionId;
        this.calle = calle;
    }

    public DireccionId getDireccionId() {
        return direccionId;
    }

    public Calle getCalle() {
        return calle;
    }
}
