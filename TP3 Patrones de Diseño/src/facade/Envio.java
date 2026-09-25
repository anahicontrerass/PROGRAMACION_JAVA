package facade;

public class Envio {
    public void generarYEnviarTicket(String correo) {
        System.out.println("Generando ticket QR PDF...");
        System.out.println("Ticket enviado exitosamente a '" + correo + "'.");
    }
}
