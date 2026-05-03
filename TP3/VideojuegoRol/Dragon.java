package VideojuegoRol;
//Hostil con magia
public class Dragon extends PersonaJugable implements LanzadorHechizos{
    public Dragon(double x, double y){
        super(x, y, 5);
    }
    public void interactuarEntorno(){
        System.out.println("[Dragon] Vuela sobre campo de batalla.");
    }
    public void lanzarHechizo(String hechizo){
        System.out.println("[Dragon] Lanza el hechizo: "+ hechizo +);
    }
    public void dibujar(){
        System.out.println("[Dragon] Dibujando...");
    }
}
