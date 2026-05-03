package VideojuegoRol;
//Clase abstracta para heroes
public abstract class PersonaJugable extends SerVivo {
    public PersonaJugable(double x, double y, int puntosVida){
        super(x, y, puntosVida);
    }
    public abstract void interactuarEntorno();
}
