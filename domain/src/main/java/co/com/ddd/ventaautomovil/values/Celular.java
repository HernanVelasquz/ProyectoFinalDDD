package co.com.ddd.ventaautomovil.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Celular implements ValueObject<Celular.Props> {

    public interface Props{
        String operadorTelefonia();
        String numeroCelular();
    }
    private final String operadorTelefonia;
    private final String numeroCelular;

    public Celular(String operadorTelefonia, String numeroCelular) {
        if (operadorTelefonia.length() < 2){
            throw new IllegalArgumentException("El operador no cumple con el formato valido");
        }
        if (numeroCelular.length() < 10 || numeroCelular.length() > 10){
            throw new IllegalArgumentException("El numero de celular no cumple con el formato");
        }

        this.operadorTelefonia = Objects.requireNonNull(operadorTelefonia);
        this.numeroCelular = Objects.requireNonNull(numeroCelular);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Celular)) return false;
        Celular celular = (Celular) o;
        return Objects.equals(operadorTelefonia, celular.operadorTelefonia) && Objects.equals(numeroCelular, celular.numeroCelular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operadorTelefonia, numeroCelular);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String operadorTelefonia() {
                return operadorTelefonia;
            }

            @Override
            public String numeroCelular() {
                return numeroCelular;
            }
        };
    }


}
