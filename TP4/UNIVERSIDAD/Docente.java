package UNIVERSIDAD;

public class Docente {
    private String nombre;
    private int horasAsignadas;
    private static final int LIMITE_HORAS_SEMANALES = 40;
    public Docente(String nombre) {
        this.nombre = nombre;
        this.horasAsignadas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasAsignadas() {
        return horasAsignadas;
    }
    public boolean asignarHoras(int horas) {
        if (this.horasAsignadas + horas > LIMITE_HORAS_SEMANALES) {
            System.out.println("Error de validación: El docente " + nombre + " excede el límite permitido de " + LIMITE_HORAS_SEMANALES + " horas semanales.");
            return false;
        }
        this.horasAsignadas += horas;
        return true;
    }
}
