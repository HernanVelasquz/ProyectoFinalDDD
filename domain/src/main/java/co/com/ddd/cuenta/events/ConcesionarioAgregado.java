package co.com.ddd.cuenta.events;

import co.com.ddd.cuenta.values.CuentaId;
import co.com.ddd.cuenta.values.DireccionConcesionario;
import co.com.sofka.domain.generic.DomainEvent;;

public class ConcesionarioAgregado extends DomainEvent {
    private final CuentaId cuentaId;
    private final DireccionConcesionario direccionConcesionario;

    public ConcesionarioAgregado(CuentaId cuentaId, DireccionConcesionario direccionConcesionario) {
        super("sofka.cuenta.sofka.cuenta.UsuarioAgregados");
        this.cuentaId = cuentaId;
        this.direccionConcesionario = direccionConcesionario;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public DireccionConcesionario getDireccionConcesionario() {
        return direccionConcesionario;
    }
}
