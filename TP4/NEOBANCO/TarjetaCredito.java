package NEOBANCO;

    public class TarjetaCredito {
        private String numero;
        private double limiteCredito;

        public TarjetaCredito(String numero, double limiteCredito) {
            this.numero = numero;
            this.limiteCredito = limiteCredito;
        }

        public String getNumero() {
            return numero;
        }

        @Override
        public String toString() {
            return "TarjetaCredito[numero=" + numero + ", limite=" + limiteCredito + "]";
        }
    }
