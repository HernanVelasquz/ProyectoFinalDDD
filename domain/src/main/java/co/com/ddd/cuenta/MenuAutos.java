package co.com.ddd.cuenta;

import co.com.ddd.cuenta.values.*;
import co.com.ddd.ventaautomovil.values.Cantidad;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;


public class MenuAutos extends Entity<MenuAutosId> {
    protected Marca marca;
    protected Tipo tipo;
    protected Precio precio;
    protected Nombre nombre;
    protected Modelo modelo;

    public MenuAutos(MenuAutosId entityId, Marca marca, Tipo tipo, Precio precio, Nombre nombre, Modelo modelo) {
        super(entityId);
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre = nombre.cambiarNombre(Objects.requireNonNull(nombre.value()));
    }

    public void actualizarPrecio(Precio precio){
        this.precio = precio.cambiarPrecio(Objects.requireNonNull(precio).value());
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
