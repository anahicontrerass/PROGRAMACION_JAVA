package PagosEcommerce;

public class Criptomoneda implements Pago {
    private String walletAdress;
    private String tipoCripto;

    public Criptomoneda(String walletAdress, String tipoCripto){
        this.walletAdress = walletAdress;
        this.tipoCripto = tipoCripto;
    }
    public void procesarPago(double monto){
        System.out.println("[Criptomoneda] Verificando...");
        System.out.println("Wallet: " + walletAdress);
        System.out.println("Moneda: " + tipoCripto);
        System.out.println("Transaccion confirmada: $"+ monto);
    }
}
