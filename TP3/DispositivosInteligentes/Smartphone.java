package DispositivosInteligentes;
//Usa ambas interfaces
public class Smartphone implements Fotografia, RedWifi{
    private String modelo;

    public Smartphone(String modelo){
        this.modelo = modelo;
    }
    public void tomarFotografia(){
        System.out.println("[Smartphone "+ modelo + "] Foto capturada.");
    }
    public void conectarWifi(String nombreRed){
        System.out.println("Smartphone "+ modelo + "] Conectado: " + nombreRed);
    }
}
