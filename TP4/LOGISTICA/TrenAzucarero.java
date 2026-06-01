package LOGISTICA;

import java.util.ArrayList;
import java.util.List;

public class TrenAzucarero {
    private Locomotora locomotora;
    private List<VagonCañero> vagones;
    private HojaDeRuta hojaRuta;

    public TrenAzucarero(Locomotora locomotora, String codigoViaje, String destino, String fecha) {
        if (locomotora == null) {
            System.out.println("Error: El tren no puede iniciar sin una locomotora asignada.");
        }
        this.locomotora = locomotora;
        this.vagones = new ArrayList<>();
        this.hojaRuta = new HojaDeRuta(codigoViaje, destino, fecha);
    }

    public void engancharVagon(VagonCañero vagon) {
        this.vagones.add(vagon);
        System.out.println("Vagón " + vagon.getIdVagon() + " enganchado exitosamente.");
    }

    public VagonCañero desengancharVagon(String idVagon) {
        for (int i = 0; i < vagones.size(); i++) {
            if (vagones.get(i).getIdVagon().equals(idVagon)) {
                VagonCañero vagonLiberado = vagones.remove(i);
                System.out.println("Vagón " + idVagon + " desenganchado y listo para reasignación.");
                return vagonLiberado;
            }
        }
        System.out.println("Error: Vagón no encontrado en este tren.");
        return null;
    }

    public void calcularCapacidadTotal() {
        double totalToneladas = 0;
        for (VagonCañero v : vagones) {
            totalToneladas += v.getCapacidadToneladas();
        }
        System.out.println("Capacidad de carga total actual del tren: " + totalToneladas + " toneladas.");
    }

    public void mostrarInfoViaje() {
        System.out.println("\n--- Información del Tren Azucarero ---");
        if (this.hojaRuta != null) {
            this.hojaRuta.imprimirHoja();
        } else {
            System.out.println("Estado: Viaje cancelado / Sin hoja de ruta activa.");
        }
        calcularCapacidadTotal();
    }

    public void cancelarViaje() {
        System.out.println("\nCancelando el viaje del tren...");
        this.hojaRuta = null;
        System.out.println("Viaje cancelado. La hoja de ruta ha sido destruida.");
    }
}