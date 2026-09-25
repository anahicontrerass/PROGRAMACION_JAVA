package singleton;

public class FilaVirtual {

    private static FilaVirtual instancia;

    private int usuariosEnCola;

    private FilaVirtual() {
        this.usuariosEnCola = 0;
        System.out.println("Inicializando fila virtual para el show...");
    }
    public static FilaVirtual getInstancia() {
        if (instancia == null) {
            instancia = new FilaVirtual();
        }
        return instancia;
    }
    public void agregarUsuario() {
        usuariosEnCola++;
        System.out.println("Usuario agregado. Posición en la fila: " + usuariosEnCola);
    }

    public int getUsuariosEnCola() {
        return usuariosEnCola;
    }
}
