package NEOBANCO;

import java.util.ArrayList;
import java.util.List;

    public class Billetera {
        private Usuario titular;
        private List<Cuenta> cuentas;
        private List<TarjetaCredito> tarjetas;

        public Billetera(Usuario titular) {
            if (titular == null) {
                System.out.println("Error: La billetera no debería existir sin un usuario válido.");
            }

            this.titular = titular;
            this.cuentas = new ArrayList<>();
            this.tarjetas = new ArrayList<>();
        }

        // COMPOSICIÓN: Si la billetera se cierra, esta instancia de cuenta desaparece con ella.
        public void abrirCuenta(String tipo, double saldoInicial) {
            this.cuentas.add(new Cuenta(tipo, saldoInicial));
            System.out.println("Cuenta de " + tipo + " abierta con éxito.");
        }

        // AGREGACIÓN: Recibe el objeto desde afuera.
        public void asociarTarjeta(TarjetaCredito tarjeta) {
            this.tarjetas.add(tarjeta);
            System.out.println("Tarjeta " + tarjeta.getNumero() + " asociada exitosamente.");
        }

        // AGREGACIÓN: Desvincula la tarjeta y devuelve para que siga existiendo y pueda migrar.
        public TarjetaCredito desvincularTarjeta(String numeroTarjeta) {
            for (int i = 0; i < tarjetas.size(); i++) {
                if (tarjetas.get(i).getNumero().equals(numeroTarjeta)) {
                    TarjetaCredito tarjetaMigrada = tarjetas.remove(i);
                    System.out.println("Tarjeta " + numeroTarjeta + " desvinculada (lista para migrar).");
                    return tarjetaMigrada;
                }
            }
            System.out.println("Tarjeta no encontrada.");
            return null;
        }

        // Gestionar saldos consolidados
        public void mostrarSaldosConsolidados() {
            if (titular != null) {
                System.out.println("\n--- Saldos Consolidados de " + titular.getNombre() + " ---");
            } else {
                System.out.println("\n--- Saldos Consolidados (Sin Titular Asignado) ---");
            }

            double totalSaldos = 0;
            for (Cuenta c : cuentas) {
                System.out.println("- " + c.toString());
                totalSaldos += c.getSaldo();
            }
            System.out.println("Suma total (sin conversión): " + totalSaldos);
            System.out.println("----------------------------------\n");
        }

        //Movimientos entre cuentas
        public void transferirEntreCuentas(String tipoOrigen, String tipoDestino, double monto) {
            Cuenta origen = buscarCuenta(tipoOrigen);
            Cuenta destino = buscarCuenta(tipoDestino);

            if (origen == null || destino == null) {
                System.out.println("Error: No se encontraron ambas cuentas para la transferencia.");
                return;
            }

            if (origen.getSaldo() >= monto) {
                System.out.println("Iniciando transferencia de " + monto + " de " + tipoOrigen + " a " + tipoDestino + "...");
                origen.extraer(monto);
                destino.depositar(monto);
                System.out.println("Transferencia completada con éxito.");
            } else {
                System.out.println("Error: Saldo insuficiente en la cuenta de origen.");
            }
        }

        private Cuenta buscarCuenta(String tipo) {
            for (Cuenta c : cuentas) {
                if (c.getTipo().equals(tipo)) {
                    return c;
                }
            }
            return null;
        }

        public void cerrarBilletera() {
            if (titular != null) {
                System.out.println("Cerrando la billetera de " + titular.getNombre() + "...");
            } else {
                System.out.println("Cerrando billetera...");
            }

            this.cuentas.clear(); // Las cuentas desaparecen de la memoria
            this.titular = null;
            System.out.println("Billetera cerrada. Las cuentas han sido eliminadas por privacidad.");
        }
    }
