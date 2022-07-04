package co.com.ddd.cuenta;

import co.com.ddd.cuenta.commands.ActualizarPrecioaCommand;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ActualizarPrecioUseCase extends UseCase<RequestCommand<ActualizarPrecioaCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ActualizarPrecioaCommand> actualizarPrecioaCommandRequestCommand) {
        var command = actualizarPrecioaCommandRequestCommand.getCommand();
        var cuenta = Cuenta.from (
                command.getCuentaId(),
                repository().getEventsBy(command.getCuentaId().value())
        );
        cuenta.actualizarPrecio(command.getMenuAutosId(), command.getPrecio());
        emit().onResponse(new ResponseEvents(cuenta.getUncommittedChanges()));
    }
}
