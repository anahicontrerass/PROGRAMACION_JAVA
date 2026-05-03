public abstract class Cuenta {
    protected String titular;
    protected double saldo;

    public Cuenta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    public abstract void aplicarComisionInteres();

    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }
    public String toString(){
        return "Titular: "+ titular + "| Saldo: $" + String.format("%.2f", saldo);
    }
}
