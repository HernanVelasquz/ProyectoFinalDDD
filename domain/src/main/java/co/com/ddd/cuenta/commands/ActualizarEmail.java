package co.com.ddd.cuenta.commands;

import co.com.ddd.cuenta.values.CuentaId;
import co.com.ddd.cuenta.values.Email;
import co.com.sofka.domain.generic.Command;

public class ActualizarEmail extends Command {
    private final CuentaId cuentaId;
    private final Email email;

    public ActualizarEmail(CuentaId cuentaId, Email email) {
        this.cuentaId = cuentaId;
        this.email = email;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public Email getEmail() {
        return email;
    }
}
