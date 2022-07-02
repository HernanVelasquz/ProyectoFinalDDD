package co.com.ddd.ventaautomovil;

import co.com.ddd.cuenta.values.*;
import co.com.ddd.ventaautomovil.events.VentaAutomovilCreada;
import co.com.ddd.ventaautomovil.values.Nombre;
import co.com.ddd.ventaautomovil.commands.CrearVentaAutomovilCommand;
import co.com.ddd.ventaautomovil.values.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
class CrearVentaAutomovilUseCaseTest {

    @InjectMocks
    CrearVentaAutomovilUseCase useCase;

    @Test
    public void crearVenta () {
        //arrange
        VentaAutomovilId ventaAutomovilId = VentaAutomovilId.of("1");
        CuentaId cuentaId = CuentaId.of("1");
        FacturaId facturaId = FacturaId.of("xxxxx");
        Cantidad cantidad = new Cantidad(3);
        InformacionCompra informacionCompra = new InformacionCompra("Camineta","2001","Toyota");
        Fecha fecha = new Fecha("2022-07-01");
        ClienteId clienteId = ClienteId.of("22");
        DocumentoCliente documentoCliente = new DocumentoCliente("cc","2222222222");
        Celular celular = new Celular("Tigo", "3017562594");
        Nombre nombre = new Nombre("David");
        Direccion direccion = new Direccion("Santa Rita", "Carrera 22-07");

        var command = new CrearVentaAutomovilCommand(
                ventaAutomovilId,
                cuentaId,
                facturaId,
                cantidad,
                informacionCompra,
                fecha,
                clienteId,
                documentoCliente,
                celular,
                nombre,
                direccion
        );
        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (VentaAutomovilCreada) events.get(0);
    }
}
