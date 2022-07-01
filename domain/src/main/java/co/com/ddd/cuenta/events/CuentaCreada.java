package co.com.ddd.cuenta.events;

import co.com.ddd.cuenta.values.ConcesionarioId;
import co.com.ddd.cuenta.values.CuentaId;
import co.com.ddd.cuenta.values.UsuarioSistemaId;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.ddd.ventaautomovil.values.VentaAutomovilId;

public class CuentaCreada extends DomainEvent {
    private final CuentaId cuentaId;
    protected final VentaAutomovilId ventaAutomovilId;
    protected final UsuarioSistemaId usuarioSistemaId;
    protected final ConcesionarioId concesionarioId;

    public CuentaCreada(CuentaId cuentaId, VentaAutomovilId ventaAutomovilId, UsuarioSistemaId usuarioSistemaId, ConcesionarioId concesionarioId) {
        super("sofka.cuenta.CuentaCreada");
        this.cuentaId = cuentaId;
        this.ventaAutomovilId = ventaAutomovilId;
        this.usuarioSistemaId = usuarioSistemaId;
        this.concesionarioId = concesionarioId;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
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
