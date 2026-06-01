package UNIVERSIDAD;

public class Carrera {
    private String nombre;
    private PlanDeEstudios plan; // Composición

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.plan = new PlanDeEstudios();
    }

    public PlanDeEstudios getPlan() {
        return plan;
    }

    public void mostrarCarrera() {
        System.out.println("    Carrera: " + nombre);
        System.out.println("    Estructura del Plan de Estudios:");
        plan.mostrarPlan();
    }
}
