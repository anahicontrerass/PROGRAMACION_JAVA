package decorator;

public class ValidacionDNI extends ValidacionDecorator {
    public ValidacionDNI (ValidacionSeguridad validacionEnvuelta) {
        super(validacionEnvuelta);
    }

    @Override
    public void ejecutarValidacion() {
        super.ejecutarValidacion();
        System.out.println("Seguridad Extra: Solicitando escaneo de DNI físico para verificar identidad...");
    }
}
