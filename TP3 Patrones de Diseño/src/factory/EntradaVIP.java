package factory;

public class EntradaVIP implements Entrada {
    @Override
    public void emitir() {
        System.out.println("Emitiendo Entrada VIP. Acceso anticipado y sector exclusivo.");
    }

    @Override
    public double getPrecio() {
        return 85000.0;
    }
}
