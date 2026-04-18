package Ejercicio3;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        if (saldoInicial >= 0){
            this.saldo = saldoInicial;
        }
    }
    public void depositar(double monto){
        if(monto > 0){
            saldo +=monto;
        }
    }
    public void retirar(double monto){
        if (monto > saldo) {
            System.out.println("Saldo insuficiente.");
        }else {
            saldo -=monto;
        }
    }
    public void consultarSaldo(){
        System.out.println("Saldo actual de " + titular + ": " + saldo);
    }
    protected double getSaldo(){
        return saldo;
    }
}
