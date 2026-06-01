package TELEMEDICINA;

public class Paciente {
    private String dni;
    private String nombre;
    private ExpedienteClinico expediente; // Relación de Composición

    public Paciente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.expediente = new ExpedienteClinico();
    }

    public String getNombre() {
        return nombre;
    }

    public void realizarConsulta(Medico medico, String fecha, String diagnostico, String receta) {
        if (this.expediente != null) {
            this.expediente.registrarNuevaEntrada(fecha, diagnostico, receta, medico);
            System.out.println("Consulta registrada con éxito para el paciente " + this.nombre);
        } else {
            System.out.println("Error: El paciente no tiene un expediente activo.");
        }
    }

    public void verEvolucionHistorica() {
        if (this.expediente != null) {
            System.out.println("\n=== REPORTE DE EVOLUCIÓN HISTÓRICA: " + this.nombre + " ===");
            this.expediente.generarReporte();
        } else {
            System.out.println("No se puede generar el reporte. Expediente inexistente.");
        }
    }

    public void darDeBaja() {
        System.out.println("\nProcesando baja del sistema para el paciente: " + this.nombre + "...");
        if (this.expediente != null) {
            this.expediente.destruirEntradas();
            this.expediente = null;
        }
        System.out.println("Baja completada. El expediente y las entradas médicas han sido eliminadas por privacidad.");
    }
}
