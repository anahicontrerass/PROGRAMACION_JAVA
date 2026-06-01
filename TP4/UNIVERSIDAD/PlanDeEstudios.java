package UNIVERSIDAD;

import java.util.ArrayList;
import java.util.List;

public class PlanDeEstudios {
    private List<Materia> materias; // Composición

    public PlanDeEstudios() {
        this.materias = new ArrayList<>();
    }

    public Materia agregarMateria(String nombre, int cargaHoraria) {
        Materia nuevaMateria = new Materia(nombre, cargaHoraria);
        this.materias.add(nuevaMateria);
        return nuevaMateria; // Retorna la instancia para poder asignarle el docente luego
    }

    public void mostrarPlan() {
        if (materias.isEmpty()) {
            System.out.println("      (Plan de estudios sin materias cargadas)");
            return;
        }
        for (Materia m : materias) {
            m.mostrarMateria();
        }
    }
}
