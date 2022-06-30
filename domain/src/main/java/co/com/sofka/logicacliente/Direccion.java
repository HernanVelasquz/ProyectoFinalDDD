package co.com.sofka.logicacliente;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.logicacliente.values.Calle;
import co.com.sofka.logicacliente.values.DireccionId;
import co.com.sofka.logicacliente.values.Nomenclatura;

import java.util.Objects;

public class Direccion extends Entity<DireccionId> {
    protected Calle calle;
    protected Nomenclatura nomenclatura;

    public Direccion(DireccionId entityId, Calle calle, Nomenclatura nomenclatura) {
        super(entityId);
        this.calle = calle;
        this.nomenclatura = nomenclatura;
    }

    private void cambiarCalle(Calle calle){
        this.calle = Objects.requireNonNull(calle);
    }

    private void cambiarNomenclatura(Nomenclatura nomenclatura){
        this.nomenclatura = Objects.requireNonNull(nomenclatura);
    }

    public Calle getCalle() {
        return calle;
    }

    public Nomenclatura getNomenclatura() {
        return nomenclatura;
    }
}
