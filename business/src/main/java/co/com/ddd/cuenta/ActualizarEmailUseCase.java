package co.com.ddd.cuenta;

import co.com.ddd.cuenta.commands.ActualizarEmailCommand;
import co.com.ddd.tiendaautomovil.TiendaAutomovil;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ActualizarEmailUseCase extends UseCase<RequestCommand<ActualizarEmailCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarEmailCommand> actualizarEmailCommandRequestCommand) {
        var command = actualizarEmailCommandRequestCommand.getCommand();
        var tienda = TiendaAutomovil.from(command.getTiendaId(), repository().getEventsBy(command.getTiendaId().value()));
        tienda.actualizarEmailEmpleado(command.getEmpleadoId(), command.getEmail());
        emit().onResponse(new ResponseEvents(tienda.getUncommittedChanges()));
    }
}
