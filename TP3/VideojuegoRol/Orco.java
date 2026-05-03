package VideojuegoRol;
//Hostil sin magia.
public class Orco extends MonstruoHostil{
        public Orco(double x, double y){
            super(x, y, 5);
        }
        public void interactuarEntorno(){
            System.out.println("[Orco] Ruge y golpea el suelo.");
        }
        public void dibujar(){
            System.out.println("[Orco] Dibujando...");
        }
}
