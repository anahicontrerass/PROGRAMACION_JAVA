package SuscripcionesStreaming;

public class PlanPremium extends Suscripcion {
    private double cargoExtra4K;

    public PlanPremium(String email, int numero, double costoBase, double cargoExtra4K){
        super(email, numero, costoBase);
        this.cargoExtra4K = cargoExtra4K;
    }
    public double calcularCostoMensual() {
        return getCostoBase() + cargoExtra4K;
    }
}
