package co.com.ddd.cuenta;

import co.com.ddd.cuenta.events.*;
import co.com.ddd.cuenta.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.ddd.ventaautomovil.values.VentaAutomovilId;

import java.util.List;
import java.util.Objects;


public class Cuenta extends AggregateEvent<CuentaId> {
    protected UsuarioSistema usuarioSistema;
    protected Concesionario concesionario;
    protected MenuAutos autos;
    protected CuentaId cuentaId;


    public Cuenta(CuentaId entityId, UsuarioSistemaId usuarioSistemaId,NombreUsuario nombreUsuario, Password password, Email email, ConcesionarioId concesionarioId, DireccionConcesionario direccionConcesionario, MenuAutosId menuAutosId, Marca marca, Precio precio,Tipo tipo, Nombre nombre, Modelo modelo) {
        super(entityId);
        Objects.requireNonNull(usuarioSistemaId);
        Objects.requireNonNull(nombreUsuario);
        Objects.requireNonNull(password);
        Objects.requireNonNull(email);
        Objects.requireNonNull(concesionarioId);
        Objects.requireNonNull(direccionConcesionario);
        Objects.requireNonNull(menuAutosId);
        Objects.requireNonNull(marca);
        Objects.requireNonNull(precio);
        Objects.requireNonNull(tipo);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(modelo);
        var cuentaId = new CuentaId();
        appendChange(new CuentaCreada(cuentaId,usuarioSistemaId, nombreUsuario, password,email, concesionarioId, direccionConcesionario, menuAutosId,marca, precio,tipo, nombre, modelo)).apply();
        subscribe(new CuentaChange(this));
    }

    public static Cuenta from(CuentaId id, List<DomainEvent> events){
        var cuenta = new Cuenta((id));
        events.forEach(cuenta::applyEvent);
        return cuenta;
    }

    private Cuenta(CuentaId idCuenta){
        super(idCuenta);
        subscribe(new CuentaChange(this));
    }

    public void actualizarPrecio(MenuAutosId menuAutosId, Precio precio){
        Objects.requireNonNull(menuAutosId);
        Objects.requireNonNull(precio);
        appendChange(new PrecioActualizado(menuAutosId,precio)).apply();
    }
    public void actualizarNombre(MenuAutosId menuAutosId, Nombre nombre){
        Objects.requireNonNull(menuAutosId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreActualizado(menuAutosId,nombre)).apply();
    }

    public void actualizarPassword(CuentaId cuentaId, Password password){
        Objects.requireNonNull(cuentaId);
        Objects.requireNonNull(password);
        appendChange(new PasswordActualizada(cuentaId,password)).apply();
    }

    public void actualizarEmail(CuentaId cuentaId, Email email){
        Objects.requireNonNull(cuentaId);
        Objects.requireNonNull(email);
        appendChange(new EmailActualizado(cuentaId,email)).apply();
    }

}
