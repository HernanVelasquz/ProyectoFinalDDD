package co.com.ddd.cuenta.commands;

import co.com.ddd.cuenta.values.CuentaId;
import co.com.ddd.cuenta.values.Nombre;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombre extends Command {
    private final CuentaId cuentaId;
    private final Nombre nombre;

    public ActualizarNombre(CuentaId cuentaId, Nombre nombre) {
        this.cuentaId = cuentaId;
        this.nombre = nombre;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
