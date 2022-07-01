package co.com.ddd.cuenta.values;

import co.com.sofka.domain.generic.Identity;

public class UsuarioSistemaId extends Identity {
    public UsuarioSistemaId(String uuid) {
        super(uuid);
    }

    public UsuarioSistemaId() {}

    public static UsuarioSistemaId of(String id){ return new UsuarioSistemaId(id);}
}
