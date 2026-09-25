package abstractfactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Procesando Paquete VIP ---");
        ExperienciaFactory fabricaVIP = new PaqueteVIPFactory();
        TicketAcceso ticket1 = fabricaVIP.crearTicket();
        PaseExtra extra1 = fabricaVIP.crearPaseExtra();
        ticket1.generarCodigoIngreso();
        extra1.habilitarBeneficio();

        System.out.println("\n--- Procesando Paquete Campo ---");
        ExperienciaFactory fabricaCampo = new PaqueteCampoFactory();
        TicketAcceso ticket2 = fabricaCampo.crearTicket();
        PaseExtra extra2 = fabricaCampo.crearPaseExtra();
        ticket2.generarCodigoIngreso();
        extra2.habilitarBeneficio();
    }
}
