package UNIVERSIDAD;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private String nombre;
    private List<Carrera> carreras; // Composición

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.carreras = new ArrayList<>();
    }
    public Carrera abrirCarrera(String nombreCarrera) {
        Carrera nuevaCarrera = new Carrera(nombreCarrera);
        this.carreras.add(nuevaCarrera);
        return nuevaCarrera;
    }

    public void mostrarEstructura() {
        System.out.println("\n=== ESTRUCTURA ACADÉMICA: " + this.nombre + " ===");
        if (carreras.isEmpty()) {
            System.out.println("No hay carreras vigentes.");
        } else {
            for (Carrera c : carreras) {
                c.mostrarCarrera();
            }
        }
    }

    public void cerrarFacultad() {
        System.out.println("\nCerrando de forma permanente la " + this.nombre + "...");
        this.carreras.clear(); // Se destruyen las carreras y sus planes de estudio
        System.out.println("Facultad cerrada. Las carreras dejaron de dictarse.");
    }
}
