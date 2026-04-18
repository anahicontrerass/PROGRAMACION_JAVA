package Ejercicio2;

public class Main {
    public static void main(String[] args) {
            Reloj miReloj = new Reloj();
            //Prueba 1
            miReloj.establecerHora(10, 30, 45);
            miReloj.mostrarHora();
            miReloj.avanzarSegundos();
            miReloj.mostrarHora();
            //Prueba al llegar a 59 segundos
            miReloj.establecerHora(10, 30, 59);
            miReloj.avanzarSegundos();
            miReloj.mostrarHora();
            //Prueba al llegar a 59 minutos
            miReloj.establecerHora(10, 59, 59);
            miReloj.avanzarSegundos();
            miReloj.mostrarHora();
            //Prueba para 23:59:59
            miReloj.establecerHora(23, 59, 59);
            miReloj.avanzarSegundos();
            miReloj.mostrarHora();

    }
}
