package SuscripcionesStreaming;

public class PlanBasico extends Suscripcion {
    public PlanBasico(String email, int numero, double costoBase){
        super(email, numero, costoBase);
    }
    public double calcularCostoMensual(){
        return getCostoBase(); //No tiene recargo
    }
}
