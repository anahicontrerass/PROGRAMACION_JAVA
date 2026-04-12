import java.util.Scanner;
public class Punto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        do {
            System.out.print("Ingrese la nota del alumno: ");
            nota = sc.nextInt();
        }while(nota <0 || nota>10);

        if (nota <4){
            System.out.println("Desaprobado");
        }else if (nota ==10){
            System.out.println("Sobresaliente");
        }else {
            System.out.println("Aprobado");
        }
    }
}
