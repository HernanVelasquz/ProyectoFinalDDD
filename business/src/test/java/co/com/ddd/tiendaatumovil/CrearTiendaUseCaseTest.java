package co.com.ddd.tiendaatumovil;

import co.com.ddd.tiendaautomovil.commands.CrearTiendaAutomovilCommand;
import co.com.ddd.tiendaautomovil.values.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
class CrearTiendaUseCaseTest {
    @InjectMocks
    CrearTiendaUseCase useCase;

    @Test
    public void crearTienda(){
        //arrange
        TiendadId tiendadId = TiendadId.of("1");
        EmpleadoId empleadoId = EmpleadoId.of("1");
        DocumentoEmpleado documentoEmpleado = new DocumentoEmpleado("cc","2012511159");
        Email email = new Email("hernan@gmail.com");
        Nombre nombre = new Nombre("CardTraker");
        ProductoId productoId = new ProductoId("2");
        DescripcioProducto descripcioProducto = new DescripcioProducto("Esta es una descripcion");
        Precio precio = new Precio(122000);
        Marca marca = new Marca("Toyota");
        ServicioVentaId servicioVentaId = ServicioVentaId.of("2");
        InformacioAsesorVenta informacioAsesorVenta = new InformacioAsesorVenta("Raul", "cc","xxxxxxxxxx");

        var command = new CrearTiendaAutomovilCommand(
                tiendadId,
                empleadoId,
                documentoEmpleado,
                email,
                nombre,
                productoId,
                descripcioProducto,
                precio,
                marca,
                servicioVentaId,
                informacioAsesorVenta
        );
        //act
        var event = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
    }
}