package VideojuegoRol;
//Clase abstracta para enemigos
public abstract class MonstruoHostil extends SerVivo {
    public MonstruoHostil(double x, double y, int puntosVida){
        super(x, y, puntosVida);
    }
    public abstract void interactuarEntorno();
}
