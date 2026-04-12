import java.util.Scanner;

public class Punto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el dia: ");
        int dia = sc.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = sc.nextInt();
        System.out.print("Ingrese el año: ");
        int año = sc.nextInt();

        //Dias maximos de cada mes
        int[] diasMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31};

        if (mes < 1 || mes > 12) {
            System.out.println("Error: el mes ingresado no es valido. Debe estar entre 1 y 12.");
        } else if (dia < 1 || dia > diasMes[mes]) {
            System.out.println("Error: el dia " + dia + "no es valido para el mes " + mes + ".Maximo permitido: " + diasMes[mes] + "dias.");
        } else {
            if (mes <= 3) {
                System.out.println("La fecha " + dia + "/" + mes + "/" + año + "corresponde al 1er trimestre (enero-marzo).");
            } else if (mes <= 6) {
                System.out.println("La fecha " + dia + "/" + mes + "/" + año + "corresponde al 2do trimestre (abril-junio).");
            } else if (mes <= 9) {
                System.out.println("La fecha " + dia + "/" + mes + "/" + año + "corresponde al 3er trimestre (julio-septiembre).");
            }else {
                System.out.println("La fecha " + dia + "/" + mes + "/" + año + "corresponde al 4to trimestre octubre-diciembre).");
            }
        }
    }
}