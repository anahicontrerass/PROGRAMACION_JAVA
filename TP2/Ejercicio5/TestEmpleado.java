package Ejercicio5;

public class TestEmpleado {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Leonor Natalia", 350000);
        Empleado emp2 = new Empleado("Contreras Diego", 230000);
        Empleado emp3 = new Empleado("Vera Jazmin", 170000);

        emp1.mostrarInformacion();
        emp2.mostrarInformacion();
        emp3.mostrarInformacion();

        //Aumento por porcentaje
        emp1.aumentarPorcentaje(10, "Evaluacion anual");
        //Aumento por monto
        emp2.aumentarMonto(2000, "Por productividad");

        //Cantidad total de empleados
        System.out.println("Total de empleados: " + Empleado.getCantidadEmpleados());
    }
}
