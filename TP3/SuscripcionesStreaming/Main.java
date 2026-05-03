package SuscripcionesStreaming;

public class Main {

    public static void main(String[] args) {
        Suscripcion[] suscripciones = new Suscripcion[3];
        suscripciones[0] = new PlanBasico("anahicont@gmail.com", 1, 15000);
        suscripciones[1] = new PlanFamiliar("magalicont@gmail.com", 2, 15000, 3, 1000);
        suscripciones[2] = new PlanPremium("diegomiguel@gmail.com", 3, 15000, 3000);

        double totalGanancias = 0;

        System.out.println("==== FACTURACION MENSUAL ====");
        for (int i = 0; i < suscripciones.length; i++) {
            double costo = suscripciones[i].calcularCostoMensual();
            System.out.println("Cliente #" + suscripciones[i].getNumero() + " (" + suscripciones[i].getEmail() + "): $" + costo);
            totalGanancias += costo;
        }
        System.out.println("Ganancias totales: $" + totalGanancias);

    }
}