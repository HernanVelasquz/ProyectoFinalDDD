package co.com.ddd.ventaautomovil;

import co.com.ddd.ventaautomovil.commands.CrearVentaAutomovilCommand;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearVentaAutomovilUseCase extends UseCase<RequestCommand<CrearVentaAutomovilCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearVentaAutomovilCommand> crearVentaAutomovilUseCaseRequestCommand) {
        var command = crearVentaAutomovilUseCaseRequestCommand.getCommand();
        var venta = new VentaAutomovil(
                command.ventaAutomovilId(),
                command.cuentaId(),
                command.facturaId(),
                command.cantidad(),
                command.informacionCompra(),
                command.fecha(),
                command.getClienteId(),
                command.getDocumentoCliente(),
                command.getCelular(),
                command.getNombre(),
                command.getDireccion()
        );
        emit().onResponse(new ResponseEvents(venta.getUncommittedChanges()));
    }
}
