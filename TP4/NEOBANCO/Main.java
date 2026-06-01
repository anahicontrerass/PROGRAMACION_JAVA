package NEOBANCO;

    public class Main {
        public static void main(String[] args) {
            System.out.println("=== INICIANDO SISTEMA NEOBANCO ===\n");

            Usuario usuario = new Usuario("Juan Pérez", "12345678");
            Billetera miBilletera = new Billetera(usuario);

            System.out.println("--- Abriendo Cuentas ---");
            miBilletera.abrirCuenta(Cuenta.PESOS, 50000);
            miBilletera.abrirCuenta(Cuenta.DOLARES, 1000);

            miBilletera.mostrarSaldosConsolidados();

            System.out.println("--- Realizando Transferencias ---");
            miBilletera.transferirEntreCuentas(Cuenta.PESOS, Cuenta.DOLARES, 10000);

            miBilletera.mostrarSaldosConsolidados();

            System.out.println("--- Gestionando Tarjetas de Crédito ---");
            TarjetaCredito visa = new TarjetaCredito("4500-1234-5678-9012", 500000);
            TarjetaCredito mastercard = new TarjetaCredito("5500-9876-5432-1098", 300000);

            miBilletera.asociarTarjeta(visa);
            miBilletera.asociarTarjeta(mastercard);

            System.out.println("\n--- Migrando Tarjeta ---");
            TarjetaCredito tarjetaParaMigrar = miBilletera.desvincularTarjeta("4500-1234-5678-9012");
            if (tarjetaParaMigrar != null) {
                System.out.println("Verificación: La tarjeta " + tarjetaParaMigrar.getNumero() +
                        " sigue existiendo en memoria (variable tarjetaParaMigrar) lista para otra billetera.");
            }

            System.out.println("\n--- Cierre de Billetera ---");
            miBilletera.cerrarBilletera();

            System.out.println("\n=== FIN DE EJECUCIÓN ===");
        }
    }
