package co.com.ddd.cuenta.values;

import co.com.sofka.domain.generic.Identity;

public class ConcesionarioId extends Identity {
    public ConcesionarioId(String uuid) {
        super(uuid);
    }

    public ConcesionarioId() {}

    public static ConcesionarioId of(String id){ return new ConcesionarioId(id);}
}
