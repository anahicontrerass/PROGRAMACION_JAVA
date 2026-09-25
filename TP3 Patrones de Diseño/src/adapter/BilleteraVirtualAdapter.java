package adapter;

public class BilleteraVirtualAdapter implements ProcesadorPagoTarjeta {
    private BilleteraVirtual billeteraExterna;
    private String aliasAsociado;

    public BilleteraVirtualAdapter(BilleteraVirtual billeteraExterna, String aliasAsociado) {
        this.billeteraExterna = billeteraExterna;
        this.aliasAsociado = aliasAsociado;
    }
    @Override
    public void procesarPago(String tipoTarjeta, String numeroTarjeta, double monto) {
        System.out.println("Convirtiendo requerimiento de tarjeta a débito por Billetera Virtual...");
        billeteraExterna.transferirPorAlias(this.aliasAsociado, monto);
    }
}
