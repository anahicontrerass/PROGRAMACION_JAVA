package decorator;

public class ValidacionTicketBase implements ValidacionSeguridad {
    @Override
    public void ejecutarValidacion() {
        System.out.println("Validación Base: Código del ticket encontrado en el sistema.");
    }
}
