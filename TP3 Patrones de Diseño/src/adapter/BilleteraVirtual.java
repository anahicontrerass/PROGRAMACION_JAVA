package adapter;

public class BilleteraVirtual {
    public void transferirPorAlias(String aliasUsuario, double saldoATransferir) {
        System.out.println("Billetera Virtual: Transferencia de $" + saldoATransferir
                + " debitada con éxito de la cuenta con alias: @" + aliasUsuario + ".");
    }
}
