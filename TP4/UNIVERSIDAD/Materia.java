package UNIVERSIDAD;

public class Materia {
    private String nombre;
    private int cargaHoraria;
    private Docente profesor; // Agregación

    public Materia(String nombre, int cargaHoraria) {
        this.nombre = nombre;
        this.cargaHoraria = cargaHoraria;
    }

    public void asignarDocente(Docente profesor) {
        if (profesor.asignarHoras(this.cargaHoraria)) {
            this.profesor = profesor;
            System.out.println("Éxito: Docente " + profesor.getNombre() + " asignado a la materia " + this.nombre + ".");
        } else {
            System.out.println("Operación denegada para " + this.nombre + " por sobrecarga del docente.");
        }
    }

    public void mostrarMateria() {
        String nombreDocente = (profesor != null) ? profesor.getNombre() : "Sin docente asignado";
        System.out.println("      - " + nombre + " (" + cargaHoraria + " hs) | Docente: " + nombreDocente);
    }
}
