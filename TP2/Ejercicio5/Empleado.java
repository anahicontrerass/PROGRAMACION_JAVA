package Ejercicio5;

public class Empleado {
    private final int legajo;
    private final String nombre;
    private double salario;
    private static int cantidadEmpleados = 0;
    private static int contadorLegajo = 1;

    public Empleado(String nombre, double salario){
        this.legajo = contadorLegajo;
        contadorLegajo++;
        cantidadEmpleados++;
        this.nombre = nombre;
        this.salario = salario;
    }
    public void aumentarPorcentaje(double porcentaje, String motivo){
        double aumento = salario * porcentaje /100;
        salario += aumento;
        System.out.println("Aumento por porcentaje aplicado a " + nombre);
        System.out.println("Motivo: " + motivo);
        System.out.println("Nuevo salario: " + salario);
    }
    public void aumentarMonto(double monto, String motivo){
        salario += monto;
        System.out.println("Aumento por monto aplicado a " + nombre);
        System.out.println("Motivo: " + motivo);
        System.out.println("Nuevo salario: " + salario);
    }
    public static int getCantidadEmpleados(){
        return cantidadEmpleados;
    }
    public void mostrarInformacion(){
        System.out.println("Legajo: " + legajo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}
