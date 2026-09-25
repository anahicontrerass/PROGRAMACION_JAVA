package facade;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Proceso de Compra ---\n");

        CompraFacade sistemaCompra = new CompraFacade();

        sistemaCompra.procesarCompra("Lollapalooza 2026", "123456789012", 55000.0, "anahicontreras@gmail.com");
    }
}
