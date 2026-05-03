package VideojuegoRol;

public class Main {
    public static void main(String[] args) {
        EntidadEapacial[] entidades = new EntidadEapacial[4];
        entidades[0] = new GuerreroHumano(0, 0);
        entidades[1] = new MagoElfo(2, 3);
        entidades[2] = new Orco(8, 7);
        entidades[3] = new Dragon(6, 3);

        //Actualizar coordenadas
        System.out.println("=== Actualizando coordenadas ===");
        for (int i = 0; i < entidades.length; i++) {
            entidades[i].actualizarCoordenadas(i, i);
        }
        //Calcular Vidas
        System.out.println("=== Aplicando Daño ===");
        for (int i = 0; i < entidades.length; i++) {
            if (entidades[i] instanceof SerVivo) {
                SerVivo sv = (SerVivo) entidades[i];
                sv.recibirdaño(1);
                System.out.println("¿Se encuentra con vida?" + sv.estaVivo());
            }
        }
        //Lanzamiento de hechizos
        System.out.println("=== Ataques magicos ===");
        for (int i = 0; i < entidades.length; i++) {
            if (entidades[i] instanceof LanzadorHechizos) {
                ((LanzadorHechizos) entidades[i]).lanzarHechizo("Bola de fuego.");
            }
        }

    }
}