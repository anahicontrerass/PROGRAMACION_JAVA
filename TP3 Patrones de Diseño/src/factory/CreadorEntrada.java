package factory;

public abstract class CreadorEntrada {

    protected abstract Entrada crearEntrada();

    public void procesarVenta() {
        Entrada entrada = crearEntrada();
        System.out.println("Iniciando procesamiento de pago por $" + entrada.getPrecio());
        entrada.emitir();
        System.out.println("Venta procesada con éxito.\n");
    }
}
