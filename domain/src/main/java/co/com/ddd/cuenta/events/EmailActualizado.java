package co.com.ddd.cuenta.events;

import co.com.ddd.cuenta.values.CuentaId;
import co.com.ddd.cuenta.values.Email;
import co.com.sofka.domain.generic.DomainEvent;

public class EmailActualizado extends DomainEvent {
    private final CuentaId cuentaId;
    private final Email email;

    public EmailActualizado(CuentaId cuentaId, Email email) {
        super("sofka.cuenta.EmailActualizado");
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
