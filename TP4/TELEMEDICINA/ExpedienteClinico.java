package TELEMEDICINA;

import java.util.ArrayList;
import java.util.List;

public class ExpedienteClinico {
    private List<EntradaMedica> entradas;

    public ExpedienteClinico() {
        this.entradas = new ArrayList<>();
    }

    public void registrarNuevaEntrada(String fecha, String diagnostico, String receta, Medico medico) {
        EntradaMedica nuevaEntrada = new EntradaMedica(fecha, diagnostico, receta, medico);
        this.entradas.add(nuevaEntrada);
    }

    public void generarReporte() {
        if (entradas.isEmpty()) {
            System.out.println("El expediente no contiene entradas médicas.");
            return;
        }
        for (EntradaMedica entrada : entradas) {
            entrada.imprimirEntrada();
        }
    }

    public void destruirEntradas() {
        this.entradas.clear();
    }
}
