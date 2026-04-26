public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(String titular, double saldo){
        super(titular, saldo);
    }
    public void aplicarComisionInteres(){
        saldo -= saldo * 0.05;
    }
    public String toString() {
        return "[Cuenta Corriente] " + super.toString();
    }
}
