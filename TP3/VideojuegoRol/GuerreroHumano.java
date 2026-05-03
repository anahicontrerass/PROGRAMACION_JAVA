package VideojuegoRol;
//Jugable sin magia.
public class GuerreroHumano extends PersonaJugable{
    public GuerreroHumano(double x, double y){
        super(x, y, 5);
    }
    public void interactuarEntorno(){
        System.out.println("[Guerrero Humano] Ataca.");
    }
    public void dibujar(){
        System.out.println("[Guerrero Humano] Dibujando...");
    }
}
