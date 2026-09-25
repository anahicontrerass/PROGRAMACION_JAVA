package factory;

public class CreadorVIP extends CreadorEntrada {
    @Override
    protected Entrada crearEntrada() {
        return new EntradaVIP();
    }
}
