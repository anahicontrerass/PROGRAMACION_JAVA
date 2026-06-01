package NEOBANCO;

    public class Cuenta {

        public static final String PESOS   = "PESOS";
        public static final String DOLARES = "DOLARES";
        public static final String CRIPTO  = "CRIPTO";

        private String tipo;
        private double saldo;

        Cuenta(String tipo, double saldoInicial) {
            this.tipo = tipo;
            this.saldo = saldoInicial;
        }

        public String getTipo() {
            return tipo;
        }

        public double getSaldo() {
            return saldo;
        }

        public void depositar(double monto) {
            if (monto <= 0) {
                System.out.println("Error: el monto a depositar debe ser mayor a cero.");
                return;
            }
            this.saldo += monto;
            System.out.println("Deposito de " + monto + " realizado en cuenta " + tipo);
        }

        public void extraer(double monto) {
            if (monto <= 0) {
                System.out.println("Error: el monto a extraer debe ser mayor a cero.");
                return;
            }
            if (monto > this.saldo) {
                System.out.println("Error: saldo insuficiente en cuenta " + tipo + ". Saldo actual: " + saldo);
                return;
            }
            this.saldo -= monto;
            System.out.println("Extraccion de " + monto + " realizada en cuenta " + tipo);
        }

        @Override
        public String toString() {
            return "Cuenta[" + tipo + ", saldo=" + saldo + "]";
        }
    }
