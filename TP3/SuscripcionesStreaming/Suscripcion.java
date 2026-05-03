package SuscripcionesStreaming;
//Clase abstracta porque no puede calcular costo sin conocer el plan
public abstract class Suscripcion {
    private String email;
    private int numero;
    private double costoBase;

    public Suscripcion(String email, int numero, double costoBase);{
        this.email = email;
        this.numero = numero;
        this.costoBase = costoBase;
    }
    public String getEmail() { return email; }
    public int getNumero() { return numero; }
    public double getCostoBase() { return costoBase; }

    public abstract double calcularCostoMensual();

}