package co.com.ddd.cuenta;

import co.com.ddd.cuenta.events.*;
import co.com.sofka.domain.generic.EventChange;

public class CuentaChange extends EventChange {
    public CuentaChange(Cuenta cuenta) {
        apply((CuentaCreada event) -> {
            cuenta.cuentaId = event.cuentaId();
            cuenta.usuarioSistema = new UsuarioSistema(event.usuarioSistemaId(),event.nombreUsuario(),event.password(), event.email());
            cuenta.concesionario = new Concesionario(event.concesionarioId(), event.direccionConcesionario());
            cuenta.autos = new MenuAutos(event.menuAutosId(), event.marca(), event.tipo(), event.precio(), event.nombre(), event.modelo());
        });

        apply((PrecioActualizado event) ->{
            cuenta.autos.actualizarPrecio(event.getPrecio());
        });

        apply((NombreActualizado event) ->{
            cuenta.autos.actualizarNombre(event.getNombre());
        });

        apply((PasswordActualizada event) ->{
            cuenta.usuarioSistema.actualizarPassword(event.getPassword());
        });

        apply((EmailActualizado event) ->{
            cuenta.usuarioSistema.actualizarEmail(event.getEmail());
        });
    }
}
