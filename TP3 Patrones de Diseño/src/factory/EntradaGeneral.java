
package factory;

public class EntradaGeneral implements Entrada {
    @Override
    public void emitir() {
        System.out.println("Emitiendo Entrada GENERAL. Acceso por puerta principal.");
    }

    @Override
    public double getPrecio() {
        return 35000.0;
    }
}
