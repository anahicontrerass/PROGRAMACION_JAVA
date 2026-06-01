package TELEMEDICINA;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE TELEMEDICINA ===\n");

        Medico drGomez = new Medico("MAT-101", "Dr. Gómez", "Cardiología");
        Medico draPerez = new Medico("MAT-102", "Dra. Pérez", "Medicina General");
        Paciente paciente1 = new Paciente("40123456", "Carlos Sánchez");

        paciente1.realizarConsulta(draPerez, "10/05/2026", "Cuadro gripal leve", "Ibuprofeno 600mg cada 8 horas");
        paciente1.realizarConsulta(drGomez, "15/05/2026", "Hipertensión controlada", "Losartán 50mg diario");

        paciente1.verEvolucionHistorica();
        paciente1.darDeBaja();
        paciente1.verEvolucionHistorica();

        System.out.println("\nNota: Los médicos " + drGomez.getNombre() + " y " + draPerez.getNombre() + " siguen existiendo en el sistema.");
    }
}