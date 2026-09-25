package adapter;

public interface ProcesadorPagoTarjeta {
    void procesarPago(String tipoTarjeta, String numeroTarjeta, double monto);
}
