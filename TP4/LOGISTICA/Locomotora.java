package LOGISTICA;

public class Locomotora {
    private String modelo;
    private String matricula;

    public Locomotora(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}
