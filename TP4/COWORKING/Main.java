package COWORKING;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE RESERVAS COWORKING ===\n");

        // Simulación del "depósito general" mencionado en la consigna
        List<Mobiliario> depositoGeneral = new ArrayList<>();

        // 1. Instanciamos el mobiliario (Entidades independientes - Agregación)
        Mobiliario silla1 = new Mobiliario("SIL-01", "Silla Ergonómica");
        Mobiliario silla2 = new Mobiliario("SIL-02", "Silla Ergonómica");
        Mobiliario escritorio = new Mobiliario("ESC-99", "Escritorio de Roble");

        // 2. Creamos el Edificio
        Edificio sedeCentral = new Edificio("Torre Empresarial", "Buenos Aires");

        // 3. Habilitamos oficinas (Composición - El edificio las crea)
        sedeCentral.habilitarNuevaOficina("101", 4);
        sedeCentral.habilitarNuevaOficina("102", 2);

        // 4. Asignamos mobiliario a las oficinas (Agregación)
        Oficina of101 = sedeCentral.getOficina("101");
        if (of101 != null) {
            of101.ingresarMueble(escritorio);
            of101.ingresarMueble(silla1);
        }

        Oficina of102 = sedeCentral.getOficina("102");
        if (of102 != null) {
            of102.ingresarMueble(silla2);
        }

        // 5. Listamos las oficinas y su mobiliario (Requerimiento)
        sedeCentral.listarOficinasDisponibles();

        // 6. Simulamos una remodelación: Quitamos los muebles de la 101 y van al depósito (Agregación)
        System.out.println("--- Iniciando Remodelación Oficina 101 ---");
        Mobiliario muebleRecuperado1 = of101.retirarMueble("ESC-99");
        Mobiliario muebleRecuperado2 = of101.retirarMueble("SIL-01");

        if (muebleRecuperado1 != null) depositoGeneral.add(muebleRecuperado1);
        if (muebleRecuperado2 != null) depositoGeneral.add(muebleRecuperado2);

        // 7. Clausuramos el edificio (Composición: Mueren las oficinas)
        sedeCentral.clausurarEdificio();

        // 8. Comprobamos que los muebles del depósito sobrevivieron
        System.out.println("\n--- Verificación del Depósito General ---");
        System.out.println("Muebles disponibles en depósito para usar en otra parte:");
        for (Mobiliario m : depositoGeneral) {
            System.out.println("- " + m.toString());
        }
    }
}
