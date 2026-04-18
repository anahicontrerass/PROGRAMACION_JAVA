package Ejercicio4;

public class Libro {
    private final String titulo;
    private final String autor;
    private final String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true; //por defecto el libro esta disponible
    }
    public void prestar(){
        if (disponible){
            disponible = false;
            System.out.println("El libro fue prestado.");
        }else {
            System.out.println("El libro ya esta prestado.");
        }
    }
    public void devolver(){
        disponible = true;
        System.out.println("El libro fue devuelto.");
    }
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Estado: " + (disponible ? "Disponible" : "Prestado"));
    }

}
