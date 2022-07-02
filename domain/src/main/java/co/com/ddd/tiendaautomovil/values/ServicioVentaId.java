package co.com.ddd.tiendaautomovil.values;

import co.com.sofka.domain.generic.Identity;

public class ServicioVentaId extends Identity {

    public ServicioVentaId(String uuid) {
        super(uuid);
    }

    public ServicioVentaId() {}

    public static ServicioVentaId of(String id){ return new ServicioVentaId(id);}
}
