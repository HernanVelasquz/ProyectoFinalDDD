package co.com.ddd.cuenta.commands;

import co.com.ddd.cuenta.values.CuentaId;
import co.com.ddd.cuenta.values.Password;
import co.com.sofka.domain.generic.Command;

public class ActualizarPassword extends Command {
    private final CuentaId cuentaId;
    private final Password password;

    public ActualizarPassword(CuentaId cuentaId, Password password) {
        this.cuentaId = cuentaId;
        this.password = password;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public Password getPassword() {
        return password;
    }
}
