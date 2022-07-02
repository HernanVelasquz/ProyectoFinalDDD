package cuenta;

import static org.junit.jupiter.api.Assertions.*;

import co.com.ddd.cuenta.commands.CrearCuentaCommand;
import co.com.ddd.cuenta.events.CuentaCreada;
import co.com.ddd.cuenta.values.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
class CrearCuentaUseCaseTest {
    @InjectMocks
    CrearCuentaUseCase useCase;

    @Test
    public void crearBebida() {
        //arrange
        CuentaId cuentaId = CuentaId.of("1");
        UsuarioSistemaId usuarioSistemaId = UsuarioSistemaId.of("1");
        NombreUsuario nombreUsuario = new NombreUsuario("Hernan");
        Password password = new Password("12345");
        Email email = new Email("hernanvelasquez@gmail.com");
        ConcesionarioId concesionarioId = ConcesionarioId.of("1");
        DireccionConcesionario direccionConcesionario = new DireccionConcesionario("Ovejas-Carrera", "2302485");
        MenuAutosId menuAutosId = MenuAutosId.of("1");
        Marca marca = new Marca("Toyota");
        Precio precio = new Precio(12200);
        Tipo tipo = new Tipo("4X4");
        Nombre nombre = new Nombre("xxxxxx");
        Modelo modelo = new Modelo("2015");

        var command = new CrearCuentaCommand(cuentaId,
                usuarioSistemaId,
                nombreUsuario,
                password,
                email,
                concesionarioId,
                direccionConcesionario,
                menuAutosId,
                marca,
                precio,
                tipo,
                nombre,
                modelo);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (CuentaCreada) events.get(0);
        //     Assertions.assertEquals("wisquie",event.getNombreBebida());
        //     Assertions.assertEquals("Usuario", event.rol().value());
    }
}