package DispositivosInteligentes;

public class Main {
    public static void main(String [] args){

        CamaraSeguridad camara = new CamaraSeguridad("Entrada Principal.");
        Termostato termostato = new Termostato("Habitacion.");
        Smartphone smartphone = new Smartphone("Samsung Galaxy.");

        System.out.println("=== Conectando dispositivos... ===");
        termostato.conectarWifi("Wifi_Rodriguez");
        smartphone.conectarWifi("Wifi_Rodriguez");

        System.out.println("\n=== Tomando Fotografias... ===");
        camara.tomarFotografia();
        smartphone.tomarFotografia();

    }
}
