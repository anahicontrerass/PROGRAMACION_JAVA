package ESPORTS;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;

    //Agregación: Los jugadores existen fuera del equipo
    private List<Jugador> jugadores;

    //Composición: El historial (lista de trofeos) le pertenece al equipo
    private List<Trofeo> historial;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
        this.historial = new ArrayList<>();
    }

    //Agregacion: El jugador se recibe como parámetro
    public void ficharJugador(Jugador jugador) {
        this.jugadores.add(jugador);
        System.out.println("Jugador " + jugador.getNickname() + " fichado en el equipo " + this.nombre + ".");
    }

    //Registrar premios recibidos por el equipo
    public void registrarPremio(String torneo, String posicion) {
        if (this.historial != null) {
            this.historial.add(new Trofeo(torneo, posicion));
            System.out.println("Premio de '" + torneo + "' registrado en la vitrina del equipo.");
        } else {
            System.out.println("Error: El equipo no tiene un historial activo para guardar trofeos.");
        }
    }

    //Actualizar stats de jugadores desde la gestión del equipo
    public void registrarKillsDeJugador(String nickname, int kills) {
        for (Jugador j : jugadores) {
            if (j.getNickname().equals(nickname)) {
                j.registrarKills(kills);
                return;
            }
        }
        System.out.println("Error: Jugador " + nickname + " no forma parte del equipo.");
    }

    public void mostrarInformacion() {
        System.out.println("\n--- Información del Equipo: " + this.nombre + " ---");
        System.out.println("Roster de Jugadores:");
        if (jugadores.isEmpty()) {
            System.out.println("    (Sin jugadores en el equipo)");
        } else {
            for (Jugador j : jugadores) {
                System.out.print("    ");
                j.mostrarEstadisticas();
            }
        }

        System.out.println("Vitrina de Trofeos:");
        if (this.historial != null) {
            if (this.historial.isEmpty()) {
                System.out.println("    El historial está vacío (0 premios).");
            } else {
                for (Trofeo t : this.historial) {
                    System.out.println("    - " + t.toString());
                }
            }
        } else {
            System.out.println("    Historial de trofeos inexistente/destruido.");
        }
    }

    public List<Jugador> disolverEquipo() {
        System.out.println("\nIniciando disolución legal del equipo " + this.nombre + "...");

        List<Jugador> agentesLibres = new ArrayList<>(this.jugadores);
        this.jugadores.clear();

        if (this.historial != null) {
            this.historial.clear();
            this.historial = null;
        }

        System.out.println("Disolución completada.");
        System.out.println("Los jugadores ahora son agentes libres. El historial de vitrinas dejó de existir.");

        return agentesLibres;
    }
}
