package facade;

public class Pago {
    public boolean cobrar(String tarjeta, double monto) {
        System.out.println("Procesando cobro de $" + monto + " a la tarjeta " + tarjeta + "...");
        System.out.println("Transacción aprobada.");
        return true;
    }
}
