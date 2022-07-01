package co.com.ddd.cuenta.commands;

import co.com.ddd.cuenta.values.CuentaId;
import co.com.ddd.cuenta.values.Precio;
import co.com.sofka.domain.generic.Command;

public class ActualizarPrecio extends Command {
    private final CuentaId cuentaId;
    private final Precio precio;

    public ActualizarPrecio(CuentaId cuentaId, Precio precio) {
        this.cuentaId = cuentaId;
        this.precio = precio;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
