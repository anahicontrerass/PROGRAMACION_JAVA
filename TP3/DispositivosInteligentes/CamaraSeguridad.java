package DispositivosInteligentes;

public class CamaraSeguridad implements Fotografia{
    private String ubicacion;

    public CamaraSeguridad(String ubicacion){
        this.ubicacion = ubicacion;
    }
    public void tomarFotografia(){
        System.out.println("[Camara de seguridad - " + ubicacion + "] Fotografia capturada.");
    }
}
