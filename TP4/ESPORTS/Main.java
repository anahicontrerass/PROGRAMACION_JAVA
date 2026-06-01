package ESPORTS;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE E-SPORTS ===\n");

        Jugador faker = new Jugador("Faker");
        Jugador s1mple = new Jugador("s1mple");
        Equipo equipoPro = new Equipo("Cloud9");

        equipoPro.ficharJugador(faker);
        equipoPro.ficharJugador(s1mple);

        equipoPro.registrarKillsDeJugador("Faker", 12);
        equipoPro.registrarKillsDeJugador("s1mple", 25);
        equipoPro.registrarPremio("Major Championship", "1er Puesto");
        equipoPro.registrarPremio("Liga Regional", "2do Puesto");

        equipoPro.mostrarInformacion();

        List<Jugador> jugadoresLiberados = equipoPro.disolverEquipo();

        equipoPro.mostrarInformacion();

        System.out.println("--- Verificación de Agentes Libres ---");
        for (Jugador j : jugadoresLiberados) {
            System.out.print("Agente libre disponible -> ");
            j.mostrarEstadisticas();
        }
    }
}
