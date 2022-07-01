package co.com.ddd.tiendaautomovil;


import co.com.ddd.tiendaautomovil.values.DescripcioProducto;
import co.com.ddd.tiendaautomovil.values.Marca;
import co.com.ddd.tiendaautomovil.values.Precio;
import co.com.ddd.tiendaautomovil.values.ProductoId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Producto extends Entity<ProductoId> {
    protected DescripcioProducto descripcioProducto;
    protected Precio precio;
    protected Marca marca;

    public Producto(ProductoId entityId, DescripcioProducto descripcioProducto, Precio precio, Marca marca) {
        super(entityId);
        this.descripcioProducto = descripcioProducto;
        this.precio = precio;
        this.marca = marca;
    }
    public void actualizarPrecio(Precio precio){
        this.precio = Objects.requireNonNull(precio);
    }
    public void actualizarMarca(Marca marca){
        this.marca = Objects.requireNonNull(marca);
    }

    public void actualizarDescripcion(DescripcioProducto descripcioProducto){
        this.descripcioProducto = Objects.requireNonNull(descripcioProducto);
    }

    public DescripcioProducto descripcioProducto() {
        return descripcioProducto;
    }

    public Precio precio() {
        return precio;
    }

    public Marca marca() {
        return marca;
    }
}
