package Ejercicio4;

public class TestLibro {
    public static void main(String[] args) {
        Libro miLibro = new Libro("Orgulloso y Prejucio", "Jane Austen", "9789876133739");

        miLibro.mostrarInfo(); //Disponible

        miLibro.prestar();
        miLibro.mostrarInfo(); //Prestado

        miLibro.devolver();
        miLibro.mostrarInfo(); //Disponible

        miLibro.prestar();
        miLibro.prestar(); //Libro ya prestado

    }
}
