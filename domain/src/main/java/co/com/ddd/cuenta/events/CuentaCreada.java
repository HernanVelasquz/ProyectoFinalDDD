package co.com.ddd.cuenta.events;

import co.com.ddd.cuenta.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class CuentaCreada extends DomainEvent {
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

    public CuentaCreada(CuentaId cuentaId,UsuarioSistemaId usuarioSistemaId, NombreUsuario nombreUsuario, Password password, Email email, ConcesionarioId concesionarioId, DireccionConcesionario direccionConcesionario, MenuAutosId menuAutosId, Marca marca, Precio precio,Tipo tipo, Nombre nombre, Modelo modelo) {
        super("sofka.cuenta.CuentaCreada");
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

    public CuentaId cuentaId() {
        return cuentaId;
    }
    public UsuarioSistemaId usuarioSistemaId() {
        return usuarioSistemaId;
    }

    public NombreUsuario nombreUsuario() {
        return nombreUsuario;
    }

    public Password password() {
        return password;
    }

    public Email email() {
        return email;
    }

    public ConcesionarioId concesionarioId() {
        return concesionarioId;
    }

    public DireccionConcesionario direccionConcesionario() {
        return direccionConcesionario;
    }

    public MenuAutosId menuAutosId() {
        return menuAutosId;
    }

    public Marca marca() {
        return marca;
    }

    public Precio precio() {
        return precio;
    }

    public Tipo tipo() {
        return tipo;
    }

    public Nombre nombre() {return nombre;}

    public Modelo modelo() {
        return modelo;
    }
}
