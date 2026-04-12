import java.util.Scanner;

 public class Punto5 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Ingrese la coordenada X (distinta de cero): ");
         int x = sc.nextInt();
         System.out.print("Ingrese la coordenada Y (distinta de cero): ");
         int y = sc.nextInt();

         if (x == 0 || y == 0) {
             System.out.println("Las coordenadas no pueden ser cero.");
         } else if (x > 0 && y > 0) {
             System.out.println("El punto (" + x + "," + y + ") se encuentra en el 1er cuadrante.");
         } else if (x < 0 && y > 0) {
             System.out.println("El punto (" + x + "," + y + ") se encuentra en el 2do cuadrante.");
         } else if (x < 0 && y < 0) {
             System.out.println("El punto (" + x + "," + y + ") se encuentra en el 3er cuadrante.");
         } else {
             System.out.println("El punto (" + x + "," + y + ") se encuentra en el 4to cuadrante.");
         }
     }
 }