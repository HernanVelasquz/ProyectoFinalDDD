package co.com.ddd.cuenta.commands;

import co.com.ddd.cuenta.values.CuentaId;
import co.com.ddd.cuenta.values.Email;
import co.com.ddd.cuenta.values.NombreUsuario;
import co.com.ddd.cuenta.values.Password;
import co.com.sofka.domain.generic.Command;

public class AgregarUsuario extends Command {
    private final CuentaId cuentaId;
    private final NombreUsuario nombreUsuario;
    private final Password password;
    private final Email email;

    public AgregarUsuario(CuentaId cuentaId, NombreUsuario nombreUsuario, Password password, Email email) {
        this.cuentaId = cuentaId;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.email = email;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public NombreUsuario getNombreUsuario() {
        return nombreUsuario;
    }

    public Password getPassword() {
        return password;
    }

    public Email getEmail() {
        return email;
    }
}
