package VideojuegoRol;
//Clase abstracta principal
public abstract class EntidadEapacial {
    private double x;
    private double y;

    public EntidadEapacial(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void actualizarCoordenadas(double x, double y){
        this.x = x;
        this.y = y;
        System.out.println(getClass().getSimpleName() + " se movio a ("+ x + "," + y +")");
    }
    public abstract void dibujar();
}
