package TELEMEDICINA;

public class EntradaMedica {
    private String fecha;
    private String diagnostico;
    private String receta;
    private Medico medicoTratante;

    public EntradaMedica(String fecha, String diagnostico, String receta, Medico medicoTratante) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.receta = receta;
        this.medicoTratante = medicoTratante;
    }

    public void imprimirEntrada() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Dr./Dra.: " + medicoTratante.getNombre() + " (" + medicoTratante.getEspecialidad() + ")");
        System.out.println("Diagnóstico: " + diagnostico);
        System.out.println("Receta: " + receta);
    }
}
