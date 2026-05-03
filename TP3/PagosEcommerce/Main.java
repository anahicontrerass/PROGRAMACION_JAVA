package PagosEcommerce;

public class Main {
    public static void main(String[] args){

        TarjetaCredito tc = new TarjetaCredito("Vera Celeste", "228-900-873");
        PayPal pp = new PayPal("diego@paypal.com", "diego.perez");
        Criptomoneda cr = new Criptomoneda("0xcABCDEFG", "Bitcoin");

        System.out.println("=== Compra 1 ===");
        tc.procesarPago(20000);
        System.out.println("=== Compra 2 ===");
        pp.procesarPago(35000);
        System.out.println("=== Compra 1 ===");
        cr.procesarPago(45000);

    }
}
