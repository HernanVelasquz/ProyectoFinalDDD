package co.com.sofka.logicacliente.values;

import co.com.sofka.domain.generic.Identity;

public class DireccionId extends Identity {
    public DireccionId(String uuid) {
        super(uuid);
    }

    public DireccionId() {}

    public static DocumentoId of(String id){return new DocumentoId(id);}
}
