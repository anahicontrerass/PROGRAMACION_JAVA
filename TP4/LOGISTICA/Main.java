package LOGISTICA;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE LOGÍSTICA AGROINDUSTRIAL ===\n");

        Locomotora loco1 = new Locomotora("General Motors G22CU", "MAT-7788");
        VagonCañero vagon1 = new VagonCañero("VC-001", 45.5);
        VagonCañero vagon2 = new VagonCañero("VC-002", 50.0);
        VagonCañero vagon3 = new VagonCañero("VC-003", 45.5);
        TrenAzucarero trenNorte = new TrenAzucarero(loco1, "VIAJE-101", "Puerto de Rosario", "02/06/2026");

        trenNorte.engancharVagon(vagon1);
        trenNorte.engancharVagon(vagon2);
        trenNorte.engancharVagon(vagon3);

        trenNorte.mostrarInfoViaje();

        VagonCañero vagonReasignado = trenNorte.desengancharVagon("VC-002");

        trenNorte.mostrarInfoViaje();
        trenNorte.cancelarViaje();
        trenNorte.mostrarInfoViaje();

        if (vagonReasignado != null) {
            System.out.println("\nVerificación: El vagón " + vagonReasignado.getIdVagon() +
                    " sigue existiendo en memoria con una capacidad de " +
                    vagonReasignado.getCapacidadToneladas() + " toneladas.");
        }
    }
}
