package co.com.ddd.tiendaautomovil.values;

import co.com.sofka.domain.generic.Identity;

public class TiendadId extends Identity {
    public TiendadId(String uuid) {
        super(uuid);
    }

    public TiendadId() {}

    public static TiendadId of(String id){return new TiendadId(id);}
}
