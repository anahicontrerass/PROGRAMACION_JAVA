package Ejercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int opcion = 1;

        while (opcion == 1){
            System.out.print("Ingrese el primer numero: ");
            double a = sc.nextDouble();

            char operador;
            while (true) {
                System.out.print("Ingrese el operador (+, -, *. /: ");
                operador = sc.next().charAt(0);
                if (operador == '+' || operador == '-' || operador == '*' || operador == '/') {
                    break;
                }
                System.out.println("Operador invalido. Ingrese un operador valido (+, -, *, /");
            }

            System.out.print("Ingrese el segundo numero: ");
            double b = sc.nextDouble();

            if (operador == '+'){
                System.out.println("Resultado: " + calc.sumar(a, b));
            }else if (operador == '-') {
                System.out.println("Resultado: " + calc.restar(a, b));
            }else if (operador == '*') {
                System.out.println("Resultado: " + calc.multiplicar(a, b));
            }if (operador == '/'){
                if (b !=0){
                    System.out.println("Resultado: " + calc.dividir(a, b));
                }
            }
            System.out.println("Desea: 1)Realizar otra operacion. 2)Salir");
            opcion = sc.nextInt();
        }
        System.out.println("Hasta luego.");
        sc.close();
    }
}