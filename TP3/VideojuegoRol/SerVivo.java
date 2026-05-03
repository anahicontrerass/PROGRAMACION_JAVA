package VideojuegoRol;

public abstract class SerVivo extends EntidadEapacial {
    private int puntosVida;

    public SerVivo(double x, double y, int puntosVida){
        super(x, y);
        this.puntosVida = puntosVida;
    }
    public void recibirdaño(int pierdevida){
        puntosVida -= pierdevida;
        System.out.println(getClass().getSimpleName() + "recibio" + pierdevida + " de daño. Vida restante: " + puntosVida);
    }
    public boolean estaVivo(){
        return puntosVida > 0;
    }
}
