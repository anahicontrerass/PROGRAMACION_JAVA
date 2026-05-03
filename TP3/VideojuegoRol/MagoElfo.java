package VideojuegoRol;

public class MagoElfo extends PersonaJugable implements LanzadorHechizos{
    public MagoElfo(double x, double y){
        super(x, y, 5);
    }
    public void interactuarEntorno(){
        System.out.println("[Mago Elfo] Estudia el entorno.");
    }
    public void lanzarHechizo(String hechizo){
        System.out.println("[Mago Elfo] Lanza el hechizo: "+ hechizo +);
    }
    public void dibujar(){
        System.out.println("[Mago Elfo] Dibujando...");
    }
}
