package abstractfactory;

public class MeetAndGreet implements PaseExtra {
    @Override
    public void habilitarBeneficio() {
        System.out.println("Pase Extra: Pulsera habilitada para conocer al artista en backstage.");
    }
}
