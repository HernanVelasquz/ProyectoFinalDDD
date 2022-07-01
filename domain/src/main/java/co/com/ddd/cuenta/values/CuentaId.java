package co.com.ddd.cuenta.values;

import co.com.sofka.domain.generic.Identity;

public class CuentaId extends Identity {
    public CuentaId(String uuid) {
        super(uuid);
    }

    public CuentaId() {}

    public static CuentaId of(String id){return new CuentaId(id);}
}
