package COWORKING;

import java.util.ArrayList;
import java.util.List;

public class Edificio {
    private String nombre;
    private String ciudad;
    private List<Oficina> oficinas; // Composición

    public Edificio(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.oficinas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    // COMPOSICIÓN: El edificio instancia directamente la oficina.
    public void habilitarNuevaOficina(String numero, int capacidadPersonas) {
        Oficina nuevaOficina = new Oficina(numero, capacidadPersonas);
        this.oficinas.add(nuevaOficina);
        System.out.println("Oficina " + numero + " construida y habilitada en el edificio " + this.nombre + ".");
    }

    // Método para acceder a una oficina específica y gestionarla
    public Oficina getOficina(String numero) {
        for (Oficina o : oficinas) {
            if (o.getNumero().equals(numero)) {
                return o;
            }
        }
        System.out.println("Error: Oficina no encontrada.");
        return null;
    }

    // REQUERIMIENTO: Listar oficinas disponibles por edificio y mobiliario asignado
    public void listarOficinasDisponibles() {
        System.out.println("\n--- Disponibilidad en Edificio: " + this.nombre + " (" + this.ciudad + ") ---");
        if (oficinas.isEmpty()) {
            System.out.println("No hay oficinas habilitadas en este edificio.");
            return;
        }

        for (Oficina o : oficinas) {
            System.out.println("Oficina N°: " + o.getNumero());
            System.out.println("  Mobiliario asignado:");
            o.mostrarMobiliario();
        }
        System.out.println("------------------------------------------------------\n");
    }

    // COMPOSICIÓN: Destrucción del edificio y, por ende, de sus oficinas.
    public void clausurarEdificio() {
        System.out.println("\nClausurando y demoliendo el edificio " + this.nombre + "...");
        this.oficinas.clear(); // Las oficinas desaparecen de la memoria
        System.out.println("Edificio clausurado. Todas las oficinas dejaron de existir.");
    }
}
