package ESPORTS;

public class Jugador {
    private String nickname;
    private int killsTotales;

    public Jugador(String nickname) {
        this.nickname = nickname;
        this.killsTotales = 0;
    }

    public String getNickname() {
        return nickname;
    }

    //Registrar estadísticas
    public void registrarKills(int cantidad) {
        this.killsTotales += cantidad;
    }

    public void mostrarEstadisticas() {
        System.out.println("Jugador: " + nickname + " | Kills totales: " + killsTotales);
    }
}