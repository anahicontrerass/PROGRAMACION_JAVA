package SistemaFlotaTransporte;

public class Furgoneta extends Vehiculo {
    private double capacidadCarga;

    public Furgoneta(String marca, String modelo, double tarifaBase, double capacidadCarga){
        super(marca, modelo, tarifaBase);
        this.capacidadCarga = capacidadCarga;
    }
    public void mostrarInfo(){
        System.out.println("=== FURGONETA ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Tarifa Base de Alquiler: $ ") + getTarifaBase();
        System.out.println("Capacidad de carga: " + capacidadCarga + "kg");
    }
}
