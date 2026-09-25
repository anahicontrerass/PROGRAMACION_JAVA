package abstractfactory;

public class PaqueteVIPFactory implements ExperienciaFactory {
    @Override
    public TicketAcceso crearTicket() {
        return new BoletoVIP();
    }

    @Override
    public PaseExtra crearPaseExtra() {
        return new MeetAndGreet();
    }
}
