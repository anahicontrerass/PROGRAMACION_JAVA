package ESPORTS;

public class Trofeo {
    private String nombreTorneo;
    private String posicion;

    public Trofeo(String nombreTorneo, String posicion) {
        this.nombreTorneo = nombreTorneo;
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Torneo: " + nombreTorneo + " - Posición: " + posicion;
    }
}
