package co.com.ddd.cuenta;

import co.com.ddd.cuenta.commands.ActualizarPrecioaCommand;
import co.com.ddd.cuenta.events.CuentaCreada;
import co.com.ddd.cuenta.events.PrecioActualizado;
import co.com.ddd.cuenta.values.*;
import co.com.ddd.cuenta.values.Email;
import co.com.ddd.cuenta.values.Marca;
import co.com.ddd.cuenta.values.Nombre;
import co.com.ddd.cuenta.values.Precio;
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
class ActualizarPrecioUseCaseTest {
    @Mock
    DomainEventRepository repository;
    @InjectMocks
    ActualizarPrecioUseCase useCase;

    ActualizarPrecioUseCaseTest(){}

    @Test
    void ActualizarPrecio(){
        CuentaId cuentaId = CuentaId.of("20");
        MenuAutosId menuAutosId = MenuAutosId.of("2");
        Precio precio = new Precio(22000000);
        ActualizarPrecioaCommand command = new ActualizarPrecioaCommand(cuentaId, menuAutosId, precio);
        Mockito.when(this.repository.getEventsBy(cuentaId.value())).thenReturn(this.history());
        this.useCase.addRepository(this.repository);
        List<DomainEvent> events = ((ResponseEvents) UseCaseHandler.getInstance()
                .syncExecutor(this.useCase, new RequestCommand<>(command))
                .orElseThrow()).getDomainEvents();
        PrecioActualizado event =(PrecioActualizado)events.get(0);
    }


    private List<DomainEvent> history(){
        CuentaId cuentaId = CuentaId.of("20");
        NombreUsuario nombreUsuario = new NombreUsuario("El suer");
        UsuarioSistemaId usuarioSistemaId =UsuarioSistemaId.of("22");
        Password password = new Password("xxx-xxxx-xxx");
        Email email = new Email("velasqeuz@algo.com");
        ConcesionarioId concesionarioId = ConcesionarioId.of("3");
        DireccionConcesionario direccionConcesionario = new DireccionConcesionario("Calle","Carrer 20 -03");
        MenuAutosId menuAutosId =  MenuAutosId.of("2");
        Marca marca = new Marca("Nisan");
        Precio precio = new  Precio(2500000);
        Tipo tipo = new Tipo("Hogar");
        Nombre nombre = new Nombre("Sandero");
        Modelo modelo = new Modelo("2001");
        return List.of(new CuentaCreada(cuentaId,usuarioSistemaId,nombreUsuario,password,email,concesionarioId,direccionConcesionario,menuAutosId,marca,precio,tipo,nombre,modelo));
    }

}