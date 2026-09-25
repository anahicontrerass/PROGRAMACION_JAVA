package decorator;

public class ValidacionNumero extends ValidacionDecorator {
    public ValidacionNumero(ValidacionSeguridad validacionEnvuelta) {
        super(validacionEnvuelta);
    }

    @Override
    public void ejecutarValidacion() {
        super.ejecutarValidacion();
        System.out.println("Seguridad Extra: Enviando SMS con token de acceso al número de celular...");
    }
}
