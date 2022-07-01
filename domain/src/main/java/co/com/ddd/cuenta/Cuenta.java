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
    protected MenuAutos menuAutos;
    protected VentaAutomovilId ventaAutomovilId;
    protected List<MenuAutos> autos;
    private UsuarioSistemaId usuarioSistemaId;
    private ConcesionarioId concesionarioId;
    private MenuAutosId menuAutosId;


    public Cuenta(CuentaId entityId, VentaAutomovilId ventaAutomovilId, UsuarioSistemaId usuarioSistemaId, ConcesionarioId concesionarioId, MenuAutosId menuAutosId) {
        super(entityId);
        this.ventaAutomovilId = ventaAutomovilId;
        this.usuarioSistemaId = usuarioSistemaId;
        this.concesionarioId = concesionarioId;
        this.menuAutosId = menuAutosId;
        Objects.requireNonNull(ventaAutomovilId);
        Objects.requireNonNull(usuarioSistemaId);
        Objects.requireNonNull(concesionarioId);
        Objects.requireNonNull(menuAutosId);
        var cuentaId = new CuentaId();
        appendChange(new CuentaCreada(cuentaId,ventaAutomovilId,usuarioSistemaId,concesionarioId)).apply();
    }

    public static Cuenta from(CuentaId idCuenta, List<DomainEvent> events){
        var cueta = new Cuenta(idCuenta);
        events.forEach(cueta::applyEvent);
        return cueta;
    }

    private Cuenta(CuentaId idCuenta){
        super(idCuenta);
        subscribe(new CuentaChange(this));
    }

    public void agregarUsuario(CuentaId cuentaId, NombreUsuario nombreUsuario, Password password, Email email){
        Objects.requireNonNull(cuentaId);
        Objects.requireNonNull(nombreUsuario);
        Objects.requireNonNull(password);
        Objects.requireNonNull(email);
        appendChange(new UsuarioAgregado(cuentaId,nombreUsuario,password,email)).apply();
    }

    public void agregarConcesionario(CuentaId cuentaId, DireccionConcesionario direccionConcesionario){
        Objects.requireNonNull(cuentaId);
        Objects.requireNonNull(direccionConcesionario);
        appendChange(new ConcesionarioAgregado(cuentaId,direccionConcesionario)).apply();
    }

    public void agregarAuto(CuentaId cuentaId, Marca marca, Tipo tipo, Precio precio, Nombre nombre, Modelo modelo){
        Objects.requireNonNull(cuentaId);
        Objects.requireNonNull(tipo);
        Objects.requireNonNull(marca);
        Objects.requireNonNull(precio);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(modelo);
        appendChange(new AutoAgregado(cuentaId,tipo,marca,precio,nombre,modelo)).apply();
    }
    public void actualizarNombre(CuentaId cuentaId,Nombre nombre){
        Objects.requireNonNull(cuentaId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreActualizado(cuentaId, nombre)).apply();
    }
    public void actualizarPrecio(CuentaId cuentaId, Precio precio){
        Objects.requireNonNull(cuentaId);
        Objects.requireNonNull(precio);
        appendChange(new PrecioActualizado(cuentaId,precio)).apply();
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
