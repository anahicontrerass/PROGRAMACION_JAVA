package factory;

public class CreadorGeneral extends CreadorEntrada {
    @Override
    protected Entrada crearEntrada() {
        return new EntradaGeneral();
    }
}
