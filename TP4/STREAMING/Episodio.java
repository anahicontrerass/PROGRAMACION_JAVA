package STREAMING;

import java.util.ArrayList;
import java.util.List;

public class Episodio {
    private String titulo;
    private int duracionMinutos;
    private List<Actor> elenco; // Agregación

    public Episodio(String titulo, int duracionMinutos) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.elenco = new ArrayList<>();
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void agregarActor(Actor actor) {
        this.elenco.add(actor);
    }

    public void mostrarInformacion() {
        System.out.print("      - " + titulo + " (" + duracionMinutos + " min) | Elenco: ");
        if (elenco.isEmpty()) {
            System.out.print("Sin actores registrados.");
        } else {
            for (int i = 0; i < elenco.size(); i++) {
                System.out.print(elenco.get(i).getNombre());
                if (i < elenco.size() - 1) System.out.print(", ");
            }
        }
        System.out.println();
    }
}
