package facade;

public class Inventario {
    public boolean verificarStock(String show) {
        System.out.println("Verificando disponibilidad para el show '" + show + "'...");
        System.out.println("¡Stock confirmado!");
        return true;
    }
}