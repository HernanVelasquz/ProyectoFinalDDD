package co.com.ddd.cuenta;

import co.com.ddd.cuenta.values.ConcesionarioId;
import co.com.ddd.cuenta.values.DireccionConcesionario;
import co.com.sofka.domain.generic.Entity;

public class Concesionario extends Entity<ConcesionarioId> {
    protected DireccionConcesionario direccionConcesionario;

    public Concesionario(ConcesionarioId entityId, DireccionConcesionario direccionConcesionario) {
        super(entityId);
        this.direccionConcesionario = direccionConcesionario;
    }

    public DireccionConcesionario getDireccionConcesionario() {
        return direccionConcesionario;
    }
}
