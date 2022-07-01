package co.com.ddd.ventaautomovil.values;

import co.com.sofka.domain.generic.Identity;

public class VentaAutomovilId extends Identity {
    public VentaAutomovilId(String uuid) {
        super(uuid);
    }

    public VentaAutomovilId() {}

    public static VentaAutomovilId of(String id){return new VentaAutomovilId(id);}
}
