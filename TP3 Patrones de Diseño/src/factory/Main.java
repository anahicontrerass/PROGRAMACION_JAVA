package factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Tipo de Venta ---\n");

        CreadorEntrada ventaGeneral = new CreadorGeneral();
        ventaGeneral.procesarVenta();

        CreadorEntrada ventaVIP = new CreadorVIP();
        ventaVIP.procesarVenta();
    }
}
