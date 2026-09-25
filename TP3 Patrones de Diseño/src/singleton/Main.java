package singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Fila Virtual ---");

        FilaVirtual terminal1 = FilaVirtual.getInstancia();
        terminal1.agregarUsuario();

        FilaVirtual terminal2 = FilaVirtual.getInstancia();
        terminal2.agregarUsuario();

        System.out.println("Total en cola según terminal 1: " + terminal1.getUsuariosEnCola());
        System.out.println("Total en cola según terminal 2: " + terminal2.getUsuariosEnCola());
        System.out.println("¿Terminal 1 y Terminal 2 son la misma instancia? " + (terminal1 == terminal2));
    }
}
