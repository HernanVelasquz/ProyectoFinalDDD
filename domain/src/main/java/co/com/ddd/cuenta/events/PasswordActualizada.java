package co.com.ddd.cuenta.events;

import co.com.ddd.cuenta.values.CuentaId;
import co.com.ddd.cuenta.values.Password;
import co.com.sofka.domain.generic.DomainEvent;

public class PasswordActualizada extends DomainEvent {
    private final CuentaId cuentaId;
    private final Password password;

    public PasswordActualizada(CuentaId cuentaId, Password password) {
        super("sofka.cuenta.PasswordActualizada");
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
