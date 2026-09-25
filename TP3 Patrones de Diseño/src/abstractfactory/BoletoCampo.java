package abstractfactory;

public class BoletoCampo implements TicketAcceso {
    @Override
    public void generarCodigoIngreso() {
        System.out.println("Ticket Campo generado: Ingreso habilitado por Puerta General.");
    }
}
