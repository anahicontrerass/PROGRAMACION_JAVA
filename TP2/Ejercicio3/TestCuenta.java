package Ejercicio3;

public class TestCuenta {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("12345", "Contreras Anahi", 10000);

        miCuenta.depositar(30000);
        miCuenta.consultarSaldo();

        miCuenta.retirar(2400);
        miCuenta.consultarSaldo();

        miCuenta.retirar(800000);
    }
}
