package facade;

public class CompraFacade {
    private Inventario inventario;
    private Pago pago;
    private Envio envio;

    public CompraFacade() {
        this.inventario = new Inventario();
        this.pago = new Pago();
        this.envio = new Envio();
    }

    public void procesarCompra(String show, String tarjeta, double monto, String correo) {
        System.out.println("Iniciando proceso de compra centralizado...\n");

        if (inventario.verificarStock(show)) {
            if (pago.cobrar(tarjeta, monto)) {
                envio.generarYEnviarTicket(correo);
                System.out.println("\nCompra finalizada con éxito. ¡Disfruta el show!");
            } else {
                System.out.println("Error en el pago.");
            }
        } else {
            System.out.println("Entradas agotadas.");
        }
    }
}
