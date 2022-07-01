package co.com.ddd.cuenta.events;

import co.com.ddd.cuenta.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class AutoAgregado extends DomainEvent {
    private final MenuAutosId menuAutos;
    private final Tipo tipo;
    private final Marca marca;
    private final Precio precio;
    private final Nombre nombre;
    private final Modelo modelo;

    public AutoAgregado(MenuAutosId menuAutos, Tipo tipo, Marca marca, Precio precio, Nombre nombre, Modelo modelo) {
        super("sofka.cuenta.AutoAgregado");
        this.menuAutos = menuAutos;
        this.tipo = tipo;
        this.marca = marca;
        this.precio = precio;
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public MenuAutosId menuAutosId() {
        return menuAutos;
    }

    public Tipo tipo() {
        return tipo;
    }

    public Marca marca() {
        return marca;
    }

    public Precio precio() {
        return precio;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Modelo modelo() {
        return modelo;
    }
}
