package PagosEcommerce;

public class PayPal implements Pago{
    private String email;
    private String alias;

    public PayPal(String email, String alias){
        this.email = email;
        this.alias = alias;
    }
    public void procesarPago(double monto){
        System.out.println("[PayPal] Iniciando transferencia...");
        System.out.println("Email: " + email);
        System.out.println("Alias: " + alias);
        System.out.println("Transferencia realizada: $"+ monto);
    }
}
