package co.com.ddd.cuenta.commands;

import co.com.ddd.cuenta.values.*;
import co.com.sofka.domain.generic.Command;
import co.com.ddd.ventaautomovil.values.VentaAutomovilId;

public class CrearCuenta extends Command {
    private final NombreUsuario nombreUsuario;
    private final Password password;
    private final Email email;
    private final VentaAutomovilId ventaAutomovilId;
    private final UsuarioSistemaId usuarioSistemaId;
    private final ConcesionarioId concesionarioId;

    public CrearCuenta(NombreUsuario nombreUsuario, Password password, Email email, VentaAutomovilId ventaAutomovilId, UsuarioSistemaId usuarioSistemaId, ConcesionarioId concesionarioId) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.email = email;
        this.ventaAutomovilId = ventaAutomovilId;
        this.usuarioSistemaId = usuarioSistemaId;
        this.concesionarioId = concesionarioId;
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

    public VentaAutomovilId getVentaAutomovilId() {
        return ventaAutomovilId;
    }

    public UsuarioSistemaId getUsuarioSistemaId() {
        return usuarioSistemaId;
    }

    public ConcesionarioId getConcesionarioId() {
        return concesionarioId;
    }
}
