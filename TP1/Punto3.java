import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Ingrese un numero entero (1-99): ");
        num = sc.nextInt();

        if(num >=1 && num <=99){
            if (num <10){
                System.out.println("El numero tiene un digito.");
            }else {
                System.out.println("El numero tiene dos digitos.");
            }
        }else{
            System.out.println("Error: El numero ingresado no esta en el rango de 1 a 99.");
        }

        }
}
