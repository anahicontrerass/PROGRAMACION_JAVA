public class CajaAhorro extends Cuenta {
    public CajaAhorro(String titular, double saldo){
        super(titular, saldo);
    }
    public void aplicarComisionInteres(){
        saldo += saldo * 0.02;
    }
    public String toString(){
        return "[Caja de Ahorro] " + super.toString();
    }
}
