package PagosEcommerce;

public class TarjetaCredito implements Pago{
    private String titular;
    private String numeroTarjeta;

    public TarjetaCredito(String titular, String numeroTarjeta){
        this.titular = titular;
        this.numeroTarjeta = numeroTarjeta;
    }
    public void procesarPago(double monto){
        System.out.println("[Tarjeta de credito] Conectando con el banco...");
        System.out.println("Titular: " + titular);
        System.out.println("Tarjeta: " + numeroTarjeta);
        System.out.println("Cobro aprobado: $"+ monto);
    }
}
