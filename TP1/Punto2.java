import java.util.Scanner;
public class Punto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = sc.nextDouble();

        double promedio = (n1 + n2 + n3) /3;

        if (promedio >= 8) {
            System.out.println("Promocionado");
        } else {
            System.out.println("No promocionado");
        }

    }
}
