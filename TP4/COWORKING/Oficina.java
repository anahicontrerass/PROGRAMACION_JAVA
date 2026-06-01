package COWORKING;

import java.util.ArrayList;
import java.util.List;

public class Oficina {
    private String numero;
    private int capacidadPersonas;
    private List<Mobiliario> inventario; // Agregación

    // El constructor es package-private o public, pero será llamado SOLO desde Edificio.
    public Oficina(String numero, int capacidadPersonas) {
        this.numero = numero;
        this.capacidadPersonas = capacidadPersonas;
        this.inventario = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    // AGREGACIÓN: Se inyecta el mobiliario desde afuera
    public void ingresarMueble(Mobiliario mueble) {
        this.inventario.add(mueble);
    }

    // AGREGACIÓN: Se retira el mueble y se devuelve para enviarlo al "depósito"
    public Mobiliario retirarMueble(String idMueble) {
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getIdMueble().equals(idMueble)) {
                Mobiliario muebleRetirado = inventario.remove(i);
                System.out.println("Mueble " + idMueble + " retirado de la oficina " + this.numero + ".");
                return muebleRetirado;
            }
        }
        System.out.println("Mueble no encontrado en la oficina " + this.numero + ".");
        return null;
    }

    public void mostrarMobiliario() {
        if (inventario.isEmpty()) {
            System.out.println("    - Sin mobiliario asignado (Oficina vacía).");
        } else {
            for (Mobiliario m : inventario) {
                System.out.println("    - " + m.toString());
            }
        }
    }
}
