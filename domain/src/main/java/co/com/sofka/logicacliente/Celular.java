package co.com.sofka.logicacliente;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.logicacliente.values.CelularId;
import co.com.sofka.logicacliente.values.NumeroCelular;
import co.com.sofka.logicacliente.values.Operador;

import java.util.Objects;

public class Celular extends Entity<CelularId> {
    protected Operador operadorCliente;
    protected NumeroCelular numeroCelular;

    public Celular(CelularId entityId, Operador operadorCliente, NumeroCelular numeroCelular) {
        super(entityId);
        this.operadorCliente = operadorCliente;
        this.numeroCelular = numeroCelular;
    }

    public void modificarOperador(Operador operadorCliente){
        this.operadorCliente = Objects.requireNonNull(operadorCliente);
    }

    public void modificarNumeroCelular(NumeroCelular numeroCelular){
        this.numeroCelular = Objects.requireNonNull(numeroCelular);
    }

    public Operador getOperadorCliente() {
        return operadorCliente;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
