package cuenta;

import co.com.ddd.cuenta.Cuenta;
import co.com.ddd.cuenta.commands.CrearCuentaCommand;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearCuentaUseCase extends UseCase<RequestCommand<CrearCuentaCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearCuentaCommand> crearCuentaCommandRequestCommand) {
        var command = crearCuentaCommandRequestCommand.getCommand();
        var cuenta = new Cuenta(
                command.getCuentaId(),
                command.getUsuarioSistemaId(),
                command.getNombreUsuario(),
                command.getPassword(),
                command.getEmail(),
                command.getConcesionarioId(),
                command.getDireccionConcesionario(),
                command.getMenuAutosId(),
                command.getMarca(),
                command.getPrecio(),
                command.getTipo(),
                command.getNombre(),
                command.getModelo()
        );
        emit().onResponse(new ResponseEvents(cuenta.getUncommittedChanges()));
    }
}
