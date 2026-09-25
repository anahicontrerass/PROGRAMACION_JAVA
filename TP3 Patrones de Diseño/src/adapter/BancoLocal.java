package adapter;

public class BancoLocal implements ProcesadorPagoTarjeta {
    @Override
    public void procesarPago(String tipoTarjeta, String numeroTarjeta, double monto) {
        System.out.println("Banco: Cobro de $" + monto + " aprobado con tarjeta de "
                + tipoTarjeta + " terminada en " + numeroTarjeta.substring(numeroTarjeta.length() - 4) + ".");
    }
}
