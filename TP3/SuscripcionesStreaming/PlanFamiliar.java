package SuscripcionesStreaming;

public class PlanFamiliar extends Suscripcion {
    private int perfilesAdicionales;
    private double recargoPerfil;

    public PlanFamiliar(String email, int numero, double costoBase, int perfilesAdicionales, double recargoPerfil){
        super(email, numero, costoBase);
        this.perfilesAdicionales = perfilesAdicionales;
        this.recargoPerfil = recargoPerfil;
    }
    public double calcularCostoMensual(){
        return getCostoBase() + (perfilesAdicionales * recargoPerfil);
    }
}
