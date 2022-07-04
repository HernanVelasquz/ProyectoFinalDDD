package co.com.ddd.cuenta.commands;

import co.com.ddd.cuenta.values.CuentaId;
import co.com.ddd.cuenta.values.MenuAutosId;
import co.com.ddd.cuenta.values.Precio;
import co.com.sofka.domain.generic.Command;

public class ActualizarPrecioaCommand extends Command {

    private final CuentaId cuentaId;
    private final MenuAutosId menuAutosId;
    private final Precio precio;

    public ActualizarPrecioaCommand(CuentaId cuentaId,MenuAutosId menuAutosId, Precio precio) {
        this.cuentaId = cuentaId;
        this.menuAutosId = menuAutosId;
        this.precio = precio;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public MenuAutosId getMenuAutosId() {
        return menuAutosId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
