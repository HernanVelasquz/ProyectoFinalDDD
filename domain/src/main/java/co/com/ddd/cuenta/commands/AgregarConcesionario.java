package co.com.ddd.cuenta.commands;

import co.com.ddd.cuenta.values.CuentaId;
import co.com.ddd.cuenta.values.DireccionConcesionario;
import co.com.sofka.domain.generic.Command;

public class AgregarConcesionario extends Command {
    private final CuentaId cuentaId;
    private final DireccionConcesionario direccionConcesionario;

    public AgregarConcesionario(CuentaId cuentaId, DireccionConcesionario direccionConcesionario) {
        this.cuentaId = cuentaId;
        this.direccionConcesionario = direccionConcesionario;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public DireccionConcesionario getDireccionConcesionario() {
        return direccionConcesionario;
    }
}
