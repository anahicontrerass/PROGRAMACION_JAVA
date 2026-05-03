package SistemaFlotaTransporte;

public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String marca, String modelo, double tarifaBase, int cilindrada){
        super(marca, modelo, tarifaBase);
        this.cilindrada = cilindrada;
    }
    public void mostrarInfo(){
        System.out.println("=== MOTOCICLETA ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Tarifa Base de Alquiler: $ ") + getTarifaBase();
        System.out.println("Cilindrada: " + cilindrada + "cc");
}
