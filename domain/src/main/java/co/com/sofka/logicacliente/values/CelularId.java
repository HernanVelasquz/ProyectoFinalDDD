package co.com.sofka.logicacliente.values;

import co.com.sofka.domain.generic.Identity;

public class CelularId extends Identity {
    public CelularId(String uuid) {
        super(uuid);
    }

    public CelularId() {}

    public static CelularId of(String id){return new CelularId(id);}
}
