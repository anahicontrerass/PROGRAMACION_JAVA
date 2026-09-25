package abstractfactory;

public class PaqueteCampoFactory implements ExperienciaFactory {
    @Override
    public TicketAcceso crearTicket() {
        return new BoletoCampo();
    }

    @Override
    public PaseExtra crearPaseExtra() {
        return new Consumicion();
    }
}
