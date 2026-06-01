package LOGISTICA;

public class HojaDeRuta {
    private String codigoViaje;
    private String destino;
    private String fecha;

    public HojaDeRuta(String codigoViaje, String destino, String fecha) {
        this.codigoViaje = codigoViaje;
        this.destino = destino;
        this.fecha = fecha;
    }

    public void imprimirHoja() {
        System.out.println("Hoja de Ruta [" + codigoViaje + "] - Destino: " + destino + " - Fecha: " + fecha);
    }
}
