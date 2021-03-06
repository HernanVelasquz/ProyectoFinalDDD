package co.com.ddd.tiendaautomovil.values;

import co.com.sofka.domain.generic.Identity;

public class ProductoId extends Identity {
    public ProductoId(String uuid) {
        super(uuid);
    }

    public ProductoId() {}
    public static ProductoId of(String id) { return new ProductoId(id);}
}
