package STREAMING;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private int numeroTemporada;
    private List<Episodio> episodios;

    public Temporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
        this.episodios = new ArrayList<>();
    }

    public Episodio agregarEpisodio(String titulo, int duracionMinutos) {
        Episodio nuevoEpisodio = new Episodio(titulo, duracionMinutos);
        this.episodios.add(nuevoEpisodio);
        return nuevoEpisodio;
    }

    public int calcularDuracionTemporada() {
        int total = 0;
        for (Episodio e : episodios) {
            total += e.getDuracionMinutos();
        }
        return total;
    }

    public void mostrarInformacion() {
        System.out.println("    Temporada " + numeroTemporada + ":");
        for (Episodio e : episodios) {
            e.mostrarInformacion();
        }
    }

    public void destruirEpisodios() {
        this.episodios.clear();
    }
}
