package co.com.ddd.cuenta.commands;

import co.com.ddd.cuenta.values.*;
import co.com.sofka.domain.generic.Command;

public class AgregarAuto extends Command {
    private final CuentaId cuentaId;
    private final Tipo tipo;
    private final Marca marca;
    private final Precio precio;
    private final Nombre nombre;
    private final Modelo modelo;

    public AgregarAuto(CuentaId cuentaId, Tipo tipo, Marca marca, Precio precio, Nombre nombre, Modelo modelo) {
        this.cuentaId = cuentaId;
        this.tipo = tipo;
        this.marca = marca;
        this.precio = precio;
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Marca getMarca() {
        return marca;
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
