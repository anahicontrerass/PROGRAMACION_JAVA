package LOGISTICA;

public class VagonCañero {
    private String idVagon;
    private double capacidadToneladas;

    public VagonCañero(String idVagon, double capacidadToneladas) {
        this.idVagon = idVagon;
        this.capacidadToneladas = capacidadToneladas;
    }

    public String getIdVagon() {
        return idVagon;
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }
}
