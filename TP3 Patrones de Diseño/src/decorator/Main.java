package decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Capas de Seguridad ---\n");

        System.out.println("Escenario A: Cuenta estándar (Requiere Correo)");
        ValidacionSeguridad seguridadEstandar = new ValidacionTicketBase();
        seguridadEstandar = new ValidacionCorreo(seguridadEstandar);
        seguridadEstandar.ejecutarValidacion();

        System.out.println("Escenario B: Cuenta sospechosa (Requiere Correo + SMS + DNI)");
        ValidacionSeguridad seguridadMaxima = new ValidacionTicketBase();

        seguridadMaxima = new ValidacionCorreo(seguridadMaxima);
        seguridadMaxima = new ValidacionNumero(seguridadMaxima);
        seguridadMaxima = new ValidacionDNI(seguridadMaxima);

        seguridadMaxima.ejecutarValidacion();
    }
}
