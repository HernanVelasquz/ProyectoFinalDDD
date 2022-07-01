package co.com.ddd.cuenta;

import co.com.ddd.cuenta.values.Email;
import co.com.ddd.cuenta.values.NombreUsuario;
import co.com.ddd.cuenta.values.Password;
import co.com.ddd.cuenta.values.UsuarioSistemaId;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class UsuarioSistema extends Entity<UsuarioSistemaId> {

    protected NombreUsuario nombreUsuario;
    protected Password password;
    protected Email email;

    public UsuarioSistema(UsuarioSistemaId entityId,NombreUsuario nombreUsuario, Password password, Email email) {
        super(entityId);
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.email = email;
    }
    public void actualizarPassword(Password password){
        this.password = password.cambiarPasswod(Objects.requireNonNull(password).value());
    }

    public void actualizarEmail(Email email){
        this.email = email.cambiarEmial(Objects.requireNonNull(email.value()));
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
