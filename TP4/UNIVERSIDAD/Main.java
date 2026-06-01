package UNIVERSIDAD;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE PLANIFICACIÓN ACADÉMICA ===\n");

        Docente docTulio = new Docente("Ing. Tulio Ruesjas Martín");
        Docente docGomez = new Docente("Lic. Gómez");

        Facultad facuInfo = new Facultad("Facultad de Ingeniería - UNSTA");

        Carrera ingInfo = facuInfo.abrirCarrera("Ingeniería Informática");
        Carrera licSist = facuInfo.abrirCarrera("Licenciatura en Sistemas");

        Materia prog2 = ingInfo.getPlan().agregarMateria("Programación II", 12);
        Materia arqComp = ingInfo.getPlan().agregarMateria("Arquitectura de Computadoras", 8);

        Materia introSist = licSist.getPlan().agregarMateria("Introducción a los Sistemas", 10);
        Materia tpIntegrador = licSist.getPlan().agregarMateria("Trabajo Práctico Integrador", 25);


        System.out.println("--- Asignación de Docentes ---");
        prog2.asignarDocente(docTulio);
        arqComp.asignarDocente(docGomez);
        introSist.asignarDocente(docTulio);

        tpIntegrador.asignarDocente(docTulio);

        facuInfo.mostrarEstructura();
        facuInfo.cerrarFacultad();
        facuInfo.mostrarEstructura();
        
        System.out.println("Verificación: El docente " + docTulio.getNombre() + " sigue existiendo en memoria con una carga retenida de " + docTulio.getHorasAsignadas() + " hs, listo para ser asignado en otra facultad.");
    }
}
