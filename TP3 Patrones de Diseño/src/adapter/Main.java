package adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Métodos de Pago ---\n");

        double totalEntrada = 65000.0;

        System.out.println("1. Cliente abona con tarjeta bancaria tradicional:");
        ProcesadorPagoTarjeta cobroBancario = new BancoLocal();
        cobroBancario.procesarPago("Crédito", "12345678", totalEntrada);

        System.out.println("2. Cliente selecciona abonar mediante Billetera Virtual:");
        BilleteraVirtual billetera = new BilleteraVirtual();

        ProcesadorPagoTarjeta cobroBilletera = new BilleteraVirtualAdapter(billetera, "anahi.musica.mp");
        cobroBilletera.procesarPago("Virtual", "87654321", totalEntrada);
    }
}
