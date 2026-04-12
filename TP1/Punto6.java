import java.util.Scanner;

public class Punto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantos triangulos desea analizar? ");
        int n = sc.nextInt();

        int cantEquilatero = 0;
        int cantIsosceles = 0;
        int cantEscaleno = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Triangulo" + i + "---");
            System.out.print("Ingrese lado 1: ");
            double lado1 = sc.nextDouble();
            System.out.println("Ingrese lado 2: ");
            double lado2 = sc.nextDouble();
            System.out.print("Ingrese lado 3: ");
            double lado3 = sc.nextDouble();

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triangulo " + i + "es EQUILATERO.");
                cantEquilatero++;
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triangulo " + i + "es ISOSCELES.");
                cantIsosceles++;
            } else {
                System.out.println("El triangulo " + i + "es ESCALENO");
                cantEscaleno++;
            }
        }

        System.out.println("\n========= RESUMEN =========");
        System.out.println("Equilateros: " + cantEquilatero);
        System.out.println("Isosceles: " + cantIsosceles);
        System.out.println("Escalenos: " + cantEscaleno);

        //Muestra el tipo con menor cantidad
        System.out.print("Tipo con menor cantidad: ");
        if (cantEquilatero <= cantIsosceles && cantEquilatero <= cantEscaleno) {
            System.out.println("Equilatero");
        } else if (cantIsosceles <= cantEscaleno) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Escaleno");
        }
    }

}
