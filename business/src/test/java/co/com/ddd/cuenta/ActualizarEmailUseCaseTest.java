package co.com.ddd.cuenta;

import co.com.ddd.cuenta.commands.ActualizarEmailCommand;
import co.com.ddd.tiendaautomovil.events.EmailEmpleadoActualizado;
import co.com.ddd.tiendaautomovil.events.TiendaAutomovilCreada;
import co.com.ddd.tiendaautomovil.values.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith({MockitoExtension.class})
class ActualizarEmailUseCaseTest {
    @Mock
    DomainEventRepository repository;
    @InjectMocks
    ActualizarEmailUseCase useCase;

    ActualizarEmailUseCaseTest(){}

    @Test
    void ActualizarEmialEmpleado(){
        TiendadId tiendadId =  TiendadId.of("25");
        EmpleadoId empleadoId = EmpleadoId.of("2");
        Email email = new  Email("hernanvelasquez@gail.com");
        ActualizarEmailCommand command = new ActualizarEmailCommand(tiendadId, empleadoId, email);
        Mockito.when(this.repository.getEventsBy(tiendadId.value())).thenReturn(this.history());
        this.useCase.addRepository(this.repository);
        List<DomainEvent> events = ((ResponseEvents) UseCaseHandler.getInstance()
                .syncExecutor(this.useCase, new RequestCommand<>(command))
                .orElseThrow()).getDomainEvents();
        EmailEmpleadoActualizado event =(EmailEmpleadoActualizado)events.get(0);
    }

    private List<DomainEvent> history(){
        TiendadId tiendadId = TiendadId.of("2");
        EmpleadoId empleadoId = EmpleadoId.of("25");
        DocumentoEmpleado documentoEmpleado = new DocumentoEmpleado("cc", "xxx-xxx-xx");
        Nombre nombre = new Nombre("HERNAN");
        Email email = new Email("hernanvelasquez@gmail.com");
        ProductoId productoId = ProductoId.of("22");
        DescripcioProducto descripcioProducto = new DescripcioProducto("Camioneta 4x4 todo terreno");
        Precio precio = new Precio(25000000);
        Marca marca = new Marca("Mazda");
        ServicioVentaId servicioVentaId = ServicioVentaId.of("22");
        InformacioAsesorVenta informacioAsesorVenta =  new InformacioAsesorVenta("Hernan Velasq", "Cc", "2222222222");
        return List.of(new TiendaAutomovilCreada(tiendadId, empleadoId,documentoEmpleado,nombre,email,productoId,descripcioProducto,precio,marca,servicioVentaId,informacioAsesorVenta));
    }
}