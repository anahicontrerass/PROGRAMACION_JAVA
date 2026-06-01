package STREAMING;

import java.util.ArrayList;
import java.util.List;

public class Serie {
    private String titulo;
    private List<Temporada> temporadas; // Composición

    public Serie(String titulo) {
        this.titulo = titulo;
        this.temporadas = new ArrayList<>();
    }

    public Temporada agregarTemporada(int numeroTemporada) {
        Temporada nuevaTemporada = new Temporada(numeroTemporada);
        this.temporadas.add(nuevaTemporada);
        System.out.println("Temporada " + numeroTemporada + " añadida a la serie '" + this.titulo + "'.");
        return nuevaTemporada;
    }

    public void calcularDuracionTotal() {
        int duracionTotal = 0;
        for (Temporada t : temporadas) {
            duracionTotal += t.calcularDuracionTemporada();
        }
        System.out.println("-> Duración total de la serie '" + this.titulo + "': " + duracionTotal + " minutos.");
    }

    public void mostrarCatalogo() {
        System.out.println("\n--- SERIE: " + this.titulo + " ---");
        for (Temporada t : temporadas) {
            t.mostrarInformacion();
        }
    }

    public void eliminarSerie() {
        System.out.println("\nEliminando la serie '" + this.titulo + "' del catálogo de streaming...");
        for (Temporada t : temporadas) {
            t.destruirEpisodios();
        }
        this.temporadas.clear();
        System.out.println("Serie eliminada correctamente. Las temporadas y episodios dejaron de existir en memoria.");
    }
}
