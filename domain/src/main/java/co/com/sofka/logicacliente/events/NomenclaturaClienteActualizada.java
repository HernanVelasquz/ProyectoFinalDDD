package co.com.sofka.logicacliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicacliente.values.DireccionId;
import co.com.sofka.logicacliente.values.Nomenclatura;

public class NomenclaturaClienteActualizada extends DomainEvent {
    private final DireccionId direccionId;
    private final Nomenclatura nomenclatura;

    public NomenclaturaClienteActualizada(DireccionId direccionId, Nomenclatura nomenclatura) {
        super("sofka.logicacliente.nomenclaturaclienteactualizada");
        this.direccionId = direccionId;
        this.nomenclatura = nomenclatura;
    }

    public DireccionId getDireccionId() {
        return direccionId;
    }

    public Nomenclatura getNomenclatura() {
        return nomenclatura;
    }
}
