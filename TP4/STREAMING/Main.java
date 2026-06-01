package STREAMING;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE STREAMING ===\n");

        Actor pedroPascal = new Actor("Pedro Pascal");
        Actor bellaRamsey = new Actor("Bella Ramsey");
        Serie theLastOfUs = new Serie("The Last of Us");
        Temporada temp1 = theLastOfUs.agregarTemporada(1);
        Episodio ep1 = temp1.agregarEpisodio("Cuando estés perdido en la oscuridad", 81);
        Episodio ep2 = temp1.agregarEpisodio("Infectados", 53);

        ep1.agregarActor(pedroPascal);
        ep1.agregarActor(bellaRamsey);
        ep2.agregarActor(pedroPascal);
        ep2.agregarActor(bellaRamsey);

        theLastOfUs.mostrarCatalogo();
        theLastOfUs.calcularDuracionTotal();
        theLastOfUs.eliminarSerie();

        System.out.println("\nVerificación: El actor " + pedroPascal.getNombre() + " sigue existiendo en el sistema, listo para otras series.");
    }
}
