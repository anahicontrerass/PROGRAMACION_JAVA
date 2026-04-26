public class CuentaInversion extends Cuenta {
    private double tasaVariable;

    public CuentaInversion(String titular, double saldo, double tasaVariable) {
        super(titular, saldo);
        this.tasaVariable = tasaVariable;
    }
    public void aplicarComisionInteres(){
        saldo += saldo * tasaVariable;
    }
    public String toString() {
        return "[Cuenta Inversion] " + super.toString() + " |Tasa: " + (tasaVariable * 100) + "%";
    }
}
