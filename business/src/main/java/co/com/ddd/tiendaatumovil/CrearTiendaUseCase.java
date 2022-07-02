package co.com.ddd.tiendaatumovil;


import co.com.ddd.tiendaautomovil.TiendaAutomovil;
import co.com.ddd.tiendaautomovil.commands.CrearTiendaAutomovilCommand;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearTiendaUseCase extends UseCase<RequestCommand<CrearTiendaAutomovilCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearTiendaAutomovilCommand> crearTiendaAutomovilCommandRequestCommand) {
        var command = crearTiendaAutomovilCommandRequestCommand.getCommand();
        var tienda = new TiendaAutomovil(
                command.getTiendadId(),
                command.getEmpleadoId(),
                command.getDocumentoEmpleado(),
                command.getEmail(),
                command.getNombre(),
                command.getIdProducto(),
                command.getDescripcioProducto(),
                command.getPrecio(),
                command.getMarca(),
                command.getServicioVentaId(),
                command.getAsesorVenta()
        );
        emit().onResponse(new ResponseEvents(tienda.getUncommittedChanges()));
    }
}
