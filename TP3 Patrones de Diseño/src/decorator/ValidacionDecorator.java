package decorator;

public abstract class ValidacionDecorator implements ValidacionSeguridad {
    protected ValidacionSeguridad validacionEnvuelta;

    public ValidacionDecorator(ValidacionSeguridad validacionEnvuelta) {
        this.validacionEnvuelta = validacionEnvuelta;
    }

    @Override
    public void ejecutarValidacion() {
        validacionEnvuelta.ejecutarValidacion();
    }
}
