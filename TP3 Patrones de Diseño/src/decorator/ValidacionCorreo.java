package decorator;

public class ValidacionCorreo extends ValidacionDecorator {
    public ValidacionCorreo(ValidacionSeguridad validacionEnvuelta) {
        super(validacionEnvuelta);
    }

    @Override
    public void ejecutarValidacion() {
        super.ejecutarValidacion();
        System.out.println("Seguridad Extra: Enviando código de 6 dígitos al correo electrónico registrado...");
    }
}
