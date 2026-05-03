package DispositivosInteligentes;

public class Termostato implements RedWifi{
    private String zona;

    public Termostato(String zona){
        this.zona = zona;
    }
    public void conectarWifi(String nombreRed){
        System.out.println("[Termostato - " + zona + "] Conectado a la red: " + nombreRed);
    }
}

