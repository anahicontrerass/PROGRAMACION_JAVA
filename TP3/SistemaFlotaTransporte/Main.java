package SistemaFlotaTransporte;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Furgoneta f1 = new Furgoneta("Volkswagen", "Crafter", 150000, 1200);
        Furgoneta f2 = new Furgoneta("Ford", "Transit", 130000, 900);
        Motocicleta m1 = new Motocicleta("Yamaha", "MT-07", 60000, 250);
        Motocicleta m2 = new Motocicleta("Honda", "CB50F", 75000, 500);

        System.out.println("==== REPORTE DE FLOTA ====");
        f1.mostrarInfo();
        System.out.println();
        f2.mostrarInfo();
        System.out.println();
        m1.mostrarInfo();
        System.out.println();
        m2.mostrarInfo();
    }
}
