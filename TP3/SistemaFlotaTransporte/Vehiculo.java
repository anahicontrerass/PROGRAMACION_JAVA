package SistemaFlotaTransporte;

public abstract class Vehiculo { //Clase abstracta con datos comunes
    private String marca;
    private String modelo;
    private double tarifaBase;

    public Vehiculo(String marca, String modelo, double tarifaBase){
        this.marca = marca;
        this.modelo = modelo;
        this.tarifaBase = tarifaBase;
    }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public double getTarifaBase() { return tarifaBase; }

    public abstract void mostrarInfo();
}
