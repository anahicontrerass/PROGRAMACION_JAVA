package abstractfactory;

public class Consumicion implements PaseExtra {
    @Override
    public void habilitarBeneficio() {
        System.out.println("Pase Extra: Código QR generado para retirar 1 (una) bebida en la barra.");
    }
}
