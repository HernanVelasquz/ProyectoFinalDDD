package co.com.ddd.cuenta.commands;

import co.com.ddd.cuenta.values.*;
import co.com.sofka.domain.generic.Command;

public class CrearCuentaCommand extends Command {
    private final CuentaId cuentaId;
    private final UsuarioSistemaId usuarioSistemaId;
    private final NombreUsuario nombreUsuario;
    private final Password password;
    private final Email email;
    private final ConcesionarioId concesionarioId;
    private final DireccionConcesionario direccionConcesionario;
    private final MenuAutosId menuAutosId;
    private final Marca marca;
    private final Tipo tipo;
    private final Precio precio;
    private final Nombre nombre;
    private final Modelo modelo;

    public CrearCuentaCommand(CuentaId cuentaId, UsuarioSistemaId usuarioSistemaId, NombreUsuario nombreUsuario, Password password, Email email, ConcesionarioId concesionarioId, DireccionConcesionario direccionConcesionario, MenuAutosId menuAutosId, Marca marca, Precio precio, Tipo tipo, Nombre nombre, Modelo modelo) {
        this.cuentaId = cuentaId;
        this.usuarioSistemaId = usuarioSistemaId;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.email = email;
        this.concesionarioId = concesionarioId;
        this.direccionConcesionario = direccionConcesionario;
        this.menuAutosId = menuAutosId;
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public UsuarioSistemaId getUsuarioSistemaId() {
        return usuarioSistemaId;
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

    public ConcesionarioId getConcesionarioId() {
        return concesionarioId;
    }

    public DireccionConcesionario getDireccionConcesionario() {
        return direccionConcesionario;
    }

    public MenuAutosId getMenuAutosId() {
        return menuAutosId;
    }

    public Marca getMarca() {
        return marca;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Modelo getModelo() {
        return modelo;
    }
}
