package COWORKING;

public class Mobiliario {
    private String idMueble;
    private String tipo; // ej: "Silla Ergonómica", "Escritorio"

    public Mobiliario(String idMueble, String tipo) {
        this.idMueble = idMueble;
        this.tipo = tipo;
    }

    public String getIdMueble() {
        return idMueble;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return tipo + " (ID: " + idMueble + ")";
    }
}