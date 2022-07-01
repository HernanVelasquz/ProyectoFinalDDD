package co.com.ddd.cuenta.values;

import co.com.sofka.domain.generic.Identity;

public class MenuAutosId extends Identity {
    public MenuAutosId(String uuid) {
        super(uuid);
    }

    public MenuAutosId() {}

    public static MenuAutosId of(String id){return new MenuAutosId(id);}
}
