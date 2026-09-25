package abstractfactory;

public class BoletoVIP implements TicketAcceso {
    @Override
    public void generarCodigoIngreso() {
        System.out.println("Ticket VIP generado: Ingreso habilitado por Puerta Preferencial (Fila Rápida).");
    }
}