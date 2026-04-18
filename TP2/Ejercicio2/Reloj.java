package Ejercicio2;

public class Reloj {
    private int hora;
    private int minutos;
    private int segundos;

    public Reloj(){
        this.hora =0;
        this.minutos =0;
        this.segundos =0;
    }

    public void establecerHora(int hora, int minutos, int segundos){
        if (hora >=0 && hora < 24){
            this.hora = hora;
        } else{
            System.out.println("Hora invalida. Debe estar entre 0 y 23.");
        }
        if (minutos >=0 && minutos <60){
            this.minutos = minutos;
        }else {
            System.out.println("Minutos invalidos. Deben estar entre 0 y 59.");
        }
        if (segundos >=0 && segundos <60){
            this.segundos = segundos;
        }else {
            System.out.println("Segundos invalidos. Deben estar entre 0 y 59.");
        }
    }
    public void mostrarHora(){
        System.out.printf("%02d:%02d:%02d%n", hora, minutos, segundos);
    }
    public void avanzarSegundos(){
        segundos++;
        if (segundos ==60){
            segundos = 0;
            minutos++;
            if(minutos ==60){
                minutos = 0;
                hora++;
                if (hora ==24){
                    hora = 0;
                }
            }
        }
    }
}
